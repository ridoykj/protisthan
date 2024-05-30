package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.deshboard.DashboardChartFieldDao;
import com.itbd.application.db.dto.dashboardchart.DashboardChartFieldDto;
import com.itbd.application.db.repos.DashboardChartFieldRepository;
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
public class DashboardChartFieldDtoCrudService implements CrudService<DashboardChartFieldDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DashboardChartFieldRepository dashboardChartFieldRepo;

    public DashboardChartFieldDtoCrudService(DashboardChartFieldRepository dashboardChartFieldRepo, JpaFilterConverter jpaFilterConverter) {
        this.dashboardChartFieldRepo = dashboardChartFieldRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DashboardChartFieldDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DashboardChartFieldDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DashboardChartFieldDao.class)
                : Specification.anyOf();
        Page<DashboardChartFieldDao> persons = dashboardChartFieldRepo.findAll(spec, pageable);
        return persons.stream().map(DashboardChartFieldDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DashboardChartFieldDto save(DashboardChartFieldDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DashboardChartFieldDao person = check
                ? dashboardChartFieldRepo.getReferenceById(value.name())
                : new DashboardChartFieldDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DashboardChartFieldDto.fromDTO(value, person);
        return DashboardChartFieldDto.fromEntity(dashboardChartFieldRepo.save(person));
    }

    @Override
    public void delete(String id) {
        dashboardChartFieldRepo.deleteById(id);
    }
}