package com.itbd.application.services.erp.contacts;

import com.itbd.application.db.dao.contacts.AddressTemplateDao;
import com.itbd.application.db.dto.address.AddressTemplateDto;
import com.itbd.application.db.repos.AddressTemplateRepository;
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
public class AddressTemplateDtoCrudService implements CrudService<AddressTemplateDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final AddressTemplateRepository addressTemplateRepo;

    public AddressTemplateDtoCrudService(AddressTemplateRepository addressRepo, JpaFilterConverter jpaFilterConverter) {
        this.addressTemplateRepo = addressRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull AddressTemplateDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<AddressTemplateDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, AddressTemplateDao.class)
                : Specification.anyOf();
        Page<AddressTemplateDao> persons = addressTemplateRepo.findAll(spec, pageable);
        return persons.stream().map(AddressTemplateDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable AddressTemplateDto save(AddressTemplateDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        AddressTemplateDao person = check
                ? addressTemplateRepo.getReferenceById(value.name())
                : new AddressTemplateDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        AddressTemplateDto.fromDTO(value, person);
        return AddressTemplateDto.fromEntity(addressTemplateRepo.save(person));
    }

    @Override
    public void delete(String id) {
        addressTemplateRepo.deleteById(id);
    }
}