package com.itbd.application.services.erp.users.customer;

import com.itbd.application.db.dao.customers.CustomerDao;
import com.itbd.application.db.dto.customers.CustomerDto;
import com.itbd.application.db.repos.CustomerRepository;
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
public class CustomerDtoCrudService implements CrudService<CustomerDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CustomerRepository customerRepo;

    public CustomerDtoCrudService(CustomerRepository customerRepo, JpaFilterConverter jpaFilterConverter) {
        this.customerRepo = customerRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CustomerDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CustomerDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CustomerDao.class)
                : Specification.anyOf();
        Page<CustomerDao> persons = customerRepo.findAll(spec, pageable);
        return persons.stream().map(CustomerDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CustomerDto save(CustomerDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CustomerDao person = check
                ? customerRepo.getReferenceById(value.name())
                : new CustomerDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CustomerDto.fromDTO(value, person);
        return CustomerDto.fromEntity(customerRepo.save(person));
    }

    @Override
    public void delete(String id) {
        customerRepo.deleteById(id);
    }
}