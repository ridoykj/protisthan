package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.sales.SalesInvoiceItemDao;
import com.itbd.application.db.dto.sales.SalesInvoiceItemDto;
import com.itbd.application.db.repos.SalesInvoiceItemRepository;
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
public class SalesInvoiceItemDtoCrudService implements CrudService<SalesInvoiceItemDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesInvoiceItemRepository salesInvoiceItemRepo;

    public SalesInvoiceItemDtoCrudService(SalesInvoiceItemRepository salesInvoiceItemRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesInvoiceItemRepo = salesInvoiceItemRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesInvoiceItemDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesInvoiceItemDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesInvoiceItemDao.class)
                : Specification.anyOf();
        Page<SalesInvoiceItemDao> persons = salesInvoiceItemRepo.findAll(spec, pageable);
        return persons.stream().map(SalesInvoiceItemDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesInvoiceItemDto save(SalesInvoiceItemDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesInvoiceItemDao person = check
                ? salesInvoiceItemRepo.getReferenceById(value.name())
                : new SalesInvoiceItemDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesInvoiceItemDto.fromDTO(value, person);
        return SalesInvoiceItemDto.fromEntity(salesInvoiceItemRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesInvoiceItemRepo.deleteById(id);
    }
}