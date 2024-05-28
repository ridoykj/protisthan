package com.itbd.application.services.erp.contacts;

import com.itbd.application.db.dao.contacts.ContactDao;
import com.itbd.application.db.dto.contacts.ContactDto;
import com.itbd.application.db.repos.ContactRepository;
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
public class ContactDtoCrudService implements CrudService<ContactDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ContactRepository contactRepo;

    public ContactDtoCrudService(ContactRepository contactRepo, JpaFilterConverter jpaFilterConverter) {
        this.contactRepo = contactRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ContactDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ContactDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ContactDao.class)
                : Specification.anyOf();
        Page<ContactDao> persons = contactRepo.findAll(spec, pageable);
        return persons.stream().map(ContactDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ContactDto save(ContactDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ContactDao person = check
                ? contactRepo.getReferenceById(value.name())
                : new ContactDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ContactDto.fromDTO(value, person);
        return ContactDto.fromEntity(contactRepo.save(person));
    }

    @Override
    public void delete(String id) {
        contactRepo.deleteById(id);
    }
}