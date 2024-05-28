package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.reports.ReportDao;
import com.itbd.application.db.dto.reports.ReportDto;
import com.itbd.application.db.repos.ReportRepository;
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
public class ReportDtoCrudService implements CrudService<ReportDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ReportRepository reportRepo;

    public ReportDtoCrudService(ReportRepository reportRepo, JpaFilterConverter jpaFilterConverter) {
        this.reportRepo = reportRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ReportDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ReportDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ReportDao.class)
                : Specification.anyOf();
        Page<ReportDao> persons = reportRepo.findAll(spec, pageable);
        return persons.stream().map(ReportDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ReportDto save(ReportDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ReportDao person = check
                ? reportRepo.getReferenceById(value.name())
                : new ReportDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ReportDto.fromDTO(value, person);
        return ReportDto.fromEntity(reportRepo.save(person));
    }

    @Override
    public void delete(String id) {
        reportRepo.deleteById(id);
    }
}