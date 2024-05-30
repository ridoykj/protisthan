package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.sales.SalesTaxesAndChargesTemplateDao;
import com.itbd.application.db.dto.sales.SalesTaxesAndChargesTemplateDto;
import com.itbd.application.db.repos.SalesTaxesAndChargesTemplateRepository;
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
public class SalesTaxesAndChargesTemplateDtoCrudService implements CrudService<SalesTaxesAndChargesTemplateDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesTaxesAndChargesTemplateRepository salesTaxesAndChargesTemplateRepo;

    public SalesTaxesAndChargesTemplateDtoCrudService(SalesTaxesAndChargesTemplateRepository salesTaxesAndChargesTemplateRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesTaxesAndChargesTemplateRepo = salesTaxesAndChargesTemplateRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesTaxesAndChargesTemplateDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesTaxesAndChargesTemplateDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesTaxesAndChargesTemplateDao.class)
                : Specification.anyOf();
        Page<SalesTaxesAndChargesTemplateDao> persons = salesTaxesAndChargesTemplateRepo.findAll(spec, pageable);
        return persons.stream().map(SalesTaxesAndChargesTemplateDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesTaxesAndChargesTemplateDto save(SalesTaxesAndChargesTemplateDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesTaxesAndChargesTemplateDao person = check
                ? salesTaxesAndChargesTemplateRepo.getReferenceById(value.name())
                : new SalesTaxesAndChargesTemplateDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesTaxesAndChargesTemplateDto.fromDTO(value, person);
        return SalesTaxesAndChargesTemplateDto.fromEntity(salesTaxesAndChargesTemplateRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesTaxesAndChargesTemplateRepo.deleteById(id);
    }
}