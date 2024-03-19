package com.itbd.application.services.user.person;

import com.itbd.application.dao.user.person.AddressDao;
import com.itbd.application.dao.user.person.PersonDao;
import com.itbd.application.dto.user.person.PersonDto;
import com.itbd.application.repos.user.person.AddressRepo;
import com.itbd.application.repos.user.person.PersonRepo;
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

import java.util.List;

@BrowserCallable
@AnonymousAllowed
public class PersonDtoCrudService implements CrudService<PersonDto, Long> {

    private final PersonRepo personRepo;
    private final AddressRepo addressRepo;
    private final JpaFilterConverter jpaFilterConverter;

    public PersonDtoCrudService(PersonRepo personRepo, AddressRepo addressRepo, JpaFilterConverter jpaFilterConverter) {
        this.personRepo = personRepo;
        this.addressRepo = addressRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PersonDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PersonDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PersonDao.class)
                : Specification.anyOf();
        Page<PersonDao> persons = personRepo.findAll(spec, pageable);
        return persons.stream().map(p -> {
            AddressDao address = p.getAddress();
//            address.setPersonKey(null);
            p.setAddress(address);
            return p;
        }).map(PersonDto::fromEntity).toList();
    }

    @Override
    public @Nullable PersonDto save(PersonDto value) {
        boolean check = value.id() != null && value.id() > 0;
        PersonDao person = check
                ? personRepo.getReferenceById(value.id())
                : new PersonDao();
        AddressDao address = person.getAddress();
        person.setAddress(address);
        PersonDto.fromDTO(value, person);
        return PersonDto.fromEntity(personRepo.save(person));
    }

    @Override
    public void delete(Long id) {
        personRepo.deleteById(id);
    }
}