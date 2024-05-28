package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.dashboardchart.DashboardChartLinkDao;
import com.itbd.application.db.dto.dashboardchart.DashboardChartLinkDto;
import com.itbd.application.db.repos.DashboardChartLinkRepository;
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
public class DashboardChartLinkDtoCrudService implements CrudService<DashboardChartLinkDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DashboardChartLinkRepository dashboardChartLinkRepo;

    public DashboardChartLinkDtoCrudService(DashboardChartLinkRepository dashboardChartLinkRepo, JpaFilterConverter jpaFilterConverter) {
        this.dashboardChartLinkRepo = dashboardChartLinkRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DashboardChartLinkDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DashboardChartLinkDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DashboardChartLinkDao.class)
                : Specification.anyOf();
        Page<DashboardChartLinkDao> persons = dashboardChartLinkRepo.findAll(spec, pageable);
        return persons.stream().map(DashboardChartLinkDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DashboardChartLinkDto save(DashboardChartLinkDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DashboardChartLinkDao person = check
                ? dashboardChartLinkRepo.getReferenceById(value.name())
                : new DashboardChartLinkDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DashboardChartLinkDto.fromDTO(value, person);
        return DashboardChartLinkDto.fromEntity(dashboardChartLinkRepo.save(person));
    }

    @Override
    public void delete(String id) {
        dashboardChartLinkRepo.deleteById(id);
    }
}