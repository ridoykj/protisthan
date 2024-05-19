package com.itbd.application.services.erp.selling.settings;

import com.itbd.application.db.dao.customers.CustomerGroupDao;
import com.itbd.application.db.dto.customers.CustomerGroupDto;
import com.itbd.application.db.repos.CustomerGroupRepository;
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
public class CustomerGroupDtoCrudService implements CrudService<CustomerGroupDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CustomerGroupRepository customerGroupRepo;

    public CustomerGroupDtoCrudService(CustomerGroupRepository customerGroupRepo, JpaFilterConverter jpaFilterConverter) {
        this.customerGroupRepo = customerGroupRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CustomerGroupDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CustomerGroupDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CustomerGroupDao.class)
                : Specification.anyOf();
        Page<CustomerGroupDao> persons = customerGroupRepo.findAll(spec, pageable);
        return persons.stream().map(CustomerGroupDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CustomerGroupDto save(CustomerGroupDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CustomerGroupDao person = check
                ? customerGroupRepo.getReferenceById(value.name())
                : new CustomerGroupDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CustomerGroupDto.fromDTO(value, person);
        return CustomerGroupDto.fromEntity(customerGroupRepo.save(person));
    }

    @Override
    public void delete(String id) {
        customerGroupRepo.deleteById(id);
    }
}