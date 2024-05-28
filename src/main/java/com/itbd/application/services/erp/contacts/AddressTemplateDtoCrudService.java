package com.itbd.application.services.erp.contacts;

import com.itbd.application.db.dao.address.AddressDao;
import com.itbd.application.db.dto.address.AddressDto;
import com.itbd.application.db.repos.AddressRepository;
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
public class AddressDtoCrudService implements CrudService<AddressDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final AddressRepository addressRepo;

    public AddressDtoCrudService(AddressRepository addressRepo, JpaFilterConverter jpaFilterConverter) {
        this.addressRepo = addressRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull AddressDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<AddressDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, AddressDao.class)
                : Specification.anyOf();
        Page<AddressDao> persons = addressRepo.findAll(spec, pageable);
        return persons.stream().map(AddressDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable AddressDto save(AddressDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        AddressDao person = check
                ? addressRepo.getReferenceById(value.name())
                : new AddressDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        AddressDto.fromDTO(value, person);
        return AddressDto.fromEntity(addressRepo.save(person));
    }

    @Override
    public void delete(String id) {
        addressRepo.deleteById(id);
    }
}