package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.deshboard.DashboardChartSourceDao;
import com.itbd.application.db.dto.dashboardchart.DashboardChartSourceDto;
import com.itbd.application.db.repos.DashboardChartSourceRepository;
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
public class DashboardChartSourceDtoCrudService implements CrudService<DashboardChartSourceDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DashboardChartSourceRepository dashboardChartSourceRepo;

    public DashboardChartSourceDtoCrudService(DashboardChartSourceRepository dashboardChartSourceRepo, JpaFilterConverter jpaFilterConverter) {
        this.dashboardChartSourceRepo = dashboardChartSourceRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DashboardChartSourceDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DashboardChartSourceDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DashboardChartSourceDao.class)
                : Specification.anyOf();
        Page<DashboardChartSourceDao> persons = dashboardChartSourceRepo.findAll(spec, pageable);
        return persons.stream().map(DashboardChartSourceDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DashboardChartSourceDto save(DashboardChartSourceDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DashboardChartSourceDao person = check
                ? dashboardChartSourceRepo.getReferenceById(value.name())
                : new DashboardChartSourceDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DashboardChartSourceDto.fromDTO(value, person);
        return DashboardChartSourceDto.fromEntity(dashboardChartSourceRepo.save(person));
    }

    @Override
    public void delete(String id) {
        dashboardChartSourceRepo.deleteById(id);
    }
}