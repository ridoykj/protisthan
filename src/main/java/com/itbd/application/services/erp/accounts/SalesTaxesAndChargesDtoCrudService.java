package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.sales.SalesTaxesAndChargesDao;
import com.itbd.application.db.dto.sales.SalesTaxesAndChargesDto;
import com.itbd.application.db.repos.SalesTaxesAndChargesRepository;
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
public class SalesTaxesAndChargesDtoCrudService implements CrudService<SalesTaxesAndChargesDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesTaxesAndChargesRepository salesTaxesAndChargesRepo;

    public SalesTaxesAndChargesDtoCrudService(SalesTaxesAndChargesRepository termsAndConditionsRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesTaxesAndChargesRepo = termsAndConditionsRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesTaxesAndChargesDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesTaxesAndChargesDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesTaxesAndChargesDao.class)
                : Specification.anyOf();
        Page<SalesTaxesAndChargesDao> persons = salesTaxesAndChargesRepo.findAll(spec, pageable);
        return persons.stream().map(SalesTaxesAndChargesDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesTaxesAndChargesDto save(SalesTaxesAndChargesDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesTaxesAndChargesDao person = check
                ? salesTaxesAndChargesRepo.getReferenceById(value.name())
                : new SalesTaxesAndChargesDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesTaxesAndChargesDto.fromDTO(value, person);
        return SalesTaxesAndChargesDto.fromEntity(salesTaxesAndChargesRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesTaxesAndChargesRepo.deleteById(id);
    }
}