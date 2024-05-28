package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.purchases.PurchaseTaxesAndChargesDao;
import com.itbd.application.db.dto.purchases.PurchaseTaxesAndChargesDto;
import com.itbd.application.db.repos.PurchaseTaxesAndChargesRepository;
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
public class PurchaseTaxesAndChargesDtoCrudService implements CrudService<PurchaseTaxesAndChargesDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PurchaseTaxesAndChargesRepository purchaseTaxesAndChargesRepo;

    public PurchaseTaxesAndChargesDtoCrudService(PurchaseTaxesAndChargesRepository purchaseTaxesAndChargesRepo, JpaFilterConverter jpaFilterConverter) {
        this.purchaseTaxesAndChargesRepo = purchaseTaxesAndChargesRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PurchaseTaxesAndChargesDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PurchaseTaxesAndChargesDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PurchaseTaxesAndChargesDao.class)
                : Specification.anyOf();
        Page<PurchaseTaxesAndChargesDao> persons = purchaseTaxesAndChargesRepo.findAll(spec, pageable);
        return persons.stream().map(PurchaseTaxesAndChargesDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PurchaseTaxesAndChargesDto save(PurchaseTaxesAndChargesDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PurchaseTaxesAndChargesDao person = check
                ? purchaseTaxesAndChargesRepo.getReferenceById(value.name())
                : new PurchaseTaxesAndChargesDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PurchaseTaxesAndChargesDto.fromDTO(value, person);
        return PurchaseTaxesAndChargesDto.fromEntity(purchaseTaxesAndChargesRepo.save(person));
    }

    @Override
    public void delete(String id) {
        purchaseTaxesAndChargesRepo.deleteById(id);
    }
}