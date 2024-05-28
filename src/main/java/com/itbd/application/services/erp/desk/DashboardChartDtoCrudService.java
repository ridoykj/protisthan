package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.dashboardchart.DashboardDao;
import com.itbd.application.db.dto.dashboardchart.DashboardDto;
import com.itbd.application.db.repos.DashboardRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import dev.hilla.Nonnull;
import dev.hilla.Nullable;
import dev.hilla.crud.CrudService;
import dev.hilla.crud.JpaFilterConverter;
import dev.hilla.crud.filter.Filter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@BrowserCallable
@AnonymousAllowed
public class DashboardDtoCrudService implements CrudService<DashboardDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DashboardRepository dashboardRepo;

    public DashboardDtoCrudService(DashboardRepository dashboardRepo, JpaFilterConverter jpaFilterConverter) {
        this.dashboardRepo = dashboardRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DashboardDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DashboardDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DashboardDao.class)
                : Specification.anyOf();
        Page<DashboardDao> persons = dashboardRepo.findAll(spec, pageable);
        return persons.stream().map(DashboardDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DashboardDto save(DashboardDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DashboardDao person = check
                ? dashboardRepo.getReferenceById(value.name())
                : new DashboardDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DashboardDto.fromDTO(value, person);
        return DashboardDto.fromEntity(dashboardRepo.save(person));
    }

    @Override
    public void delete(String id) {
        dashboardRepo.deleteById(id);
    }
}