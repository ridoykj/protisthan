package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.purchases.PurchaseTaxesAndChargesTemplateDao;
import com.itbd.application.db.dto.purchases.PurchaseTaxesAndChargesTemplateDto;
import com.itbd.application.db.repos.PurchaseTaxesAndChargesTemplateRepository;
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
public class PurchaseTaxesAndChargesTemplateDtoCrudService implements CrudService<PurchaseTaxesAndChargesTemplateDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PurchaseTaxesAndChargesTemplateRepository purchaseTaxesAndChargesTemplateRepo;

    public PurchaseTaxesAndChargesTemplateDtoCrudService(PurchaseTaxesAndChargesTemplateRepository purchaseTaxesAndChargesTemplateRepo, JpaFilterConverter jpaFilterConverter) {
        this.purchaseTaxesAndChargesTemplateRepo = purchaseTaxesAndChargesTemplateRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PurchaseTaxesAndChargesTemplateDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PurchaseTaxesAndChargesTemplateDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PurchaseTaxesAndChargesTemplateDao.class)
                : Specification.anyOf();
        Page<PurchaseTaxesAndChargesTemplateDao> persons = purchaseTaxesAndChargesTemplateRepo.findAll(spec, pageable);
        return persons.stream().map(PurchaseTaxesAndChargesTemplateDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PurchaseTaxesAndChargesTemplateDto save(PurchaseTaxesAndChargesTemplateDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PurchaseTaxesAndChargesTemplateDao person = check
                ? purchaseTaxesAndChargesTemplateRepo.getReferenceById(value.name())
                : new PurchaseTaxesAndChargesTemplateDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PurchaseTaxesAndChargesTemplateDto.fromDTO(value, person);
        return PurchaseTaxesAndChargesTemplateDto.fromEntity(purchaseTaxesAndChargesTemplateRepo.save(person));
    }

    @Override
    public void delete(String id) {
        purchaseTaxesAndChargesTemplateRepo.deleteById(id);
    }
}