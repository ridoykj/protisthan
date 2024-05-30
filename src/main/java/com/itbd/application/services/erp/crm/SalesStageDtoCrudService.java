package com.itbd.application.services.erp.crm;

import com.itbd.application.db.dao.crm.SalesStageDao;
import com.itbd.application.db.dto.sales.SalesStageDto;
import com.itbd.application.db.repos.SalesStageRepository;
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
public class SalesStageDtoCrudService implements CrudService<SalesStageDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesStageRepository salesStageRepo;

    public SalesStageDtoCrudService(SalesStageRepository salesStageRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesStageRepo = salesStageRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesStageDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesStageDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesStageDao.class)
                : Specification.anyOf();
        Page<SalesStageDao> persons = salesStageRepo.findAll(spec, pageable);
        return persons.stream().map(SalesStageDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesStageDto save(SalesStageDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesStageDao person = check
                ? salesStageRepo.getReferenceById(value.name())
                : new SalesStageDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesStageDto.fromDTO(value, person);
        return SalesStageDto.fromEntity(salesStageRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesStageRepo.deleteById(id);
    }
}