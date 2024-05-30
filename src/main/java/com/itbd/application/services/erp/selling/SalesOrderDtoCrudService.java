package com.itbd.application.services.erp.selling;

import com.itbd.application.db.dao.selling.sales.SalesOrderDao;
import com.itbd.application.db.dto.sales.SalesOrderDto;
import com.itbd.application.db.repos.SalesOrderRepository;
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
public class SalesOrderDtoCrudService implements CrudService<SalesOrderDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesOrderRepository salesOrderRepo;

    public SalesOrderDtoCrudService(SalesOrderRepository salesOrderRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesOrderRepo = salesOrderRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesOrderDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesOrderDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesOrderDao.class)
                : Specification.anyOf();
        Page<SalesOrderDao> persons = salesOrderRepo.findAll(spec, pageable);
        return persons.stream().map(SalesOrderDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesOrderDto save(SalesOrderDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesOrderDao person = check
                ? salesOrderRepo.getReferenceById(value.name())
                : new SalesOrderDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesOrderDto.fromDTO(value, person);
        return SalesOrderDto.fromEntity(salesOrderRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesOrderRepo.deleteById(id);
    }
}