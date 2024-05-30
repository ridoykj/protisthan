package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.deshboard.DashboardChartDao;
import com.itbd.application.db.dto.dashboardchart.DashboardChartDto;
import com.itbd.application.db.repos.DashboardChartRepository;
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
public class DashboardChartDtoCrudService implements CrudService<DashboardChartDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DashboardChartRepository dashboardChartRepo;

    public DashboardChartDtoCrudService(DashboardChartRepository dashboardChartRepo, JpaFilterConverter jpaFilterConverter) {
        this.dashboardChartRepo = dashboardChartRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DashboardChartDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DashboardChartDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DashboardChartDao.class)
                : Specification.anyOf();
        Page<DashboardChartDao> persons = dashboardChartRepo.findAll(spec, pageable);
        return persons.stream().map(DashboardChartDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DashboardChartDto save(DashboardChartDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DashboardChartDao person = check
                ? dashboardChartRepo.getReferenceById(value.name())
                : new DashboardChartDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DashboardChartDto.fromDTO(value, person);
        return DashboardChartDto.fromEntity(dashboardChartRepo.save(person));
    }

    @Override
    public void delete(String id) {
        dashboardChartRepo.deleteById(id);
    }
}