package com.itbd.application.services.erp.selling.invoice;

import com.itbd.application.db.dao.sales.SalesInvoiceDao;
import com.itbd.application.db.dto.sales.SalesInvoiceDto;
import com.itbd.application.db.repos.SalesInvoiceRepository;
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
public class SalesInvoiceDtoCrudService implements CrudService<SalesInvoiceDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesInvoiceRepository salesInvoiceRepo;

    public SalesInvoiceDtoCrudService(SalesInvoiceRepository salesInvoiceRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesInvoiceRepo = salesInvoiceRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesInvoiceDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesInvoiceDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesInvoiceDao.class)
                : Specification.anyOf();
        Page<SalesInvoiceDao> persons = salesInvoiceRepo.findAll(spec, pageable);
        return persons.stream().map(SalesInvoiceDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesInvoiceDto save(SalesInvoiceDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesInvoiceDao person = check
                ? salesInvoiceRepo.getReferenceById(value.name())
                : new SalesInvoiceDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesInvoiceDto.fromDTO(value, person);
        return SalesInvoiceDto.fromEntity(salesInvoiceRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesInvoiceRepo.deleteById(id);
    }
}