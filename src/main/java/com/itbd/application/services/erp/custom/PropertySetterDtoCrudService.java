package com.itbd.application.services.erp.custom;

import com.itbd.application.db.dao.PropertySetterDao;
import com.itbd.application.db.dto.PropertySetterDto;
import com.itbd.application.db.repos.PropertySetterRepository;
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
public class PropertySetterDtoCrudService implements CrudService<PropertySetterDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PropertySetterRepository propertySetterRepo;

    public PropertySetterDtoCrudService(PropertySetterRepository propertySetterRepo, JpaFilterConverter jpaFilterConverter) {
        this.propertySetterRepo = propertySetterRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PropertySetterDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PropertySetterDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PropertySetterDao.class)
                : Specification.anyOf();
        Page<PropertySetterDao> persons = propertySetterRepo.findAll(spec, pageable);
        return persons.stream().map(PropertySetterDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PropertySetterDto save(PropertySetterDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PropertySetterDao person = check
                ? propertySetterRepo.getReferenceById(value.name())
                : new PropertySetterDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PropertySetterDto.fromDTO(value, person);
        return PropertySetterDto.fromEntity(propertySetterRepo.save(person));
    }

    @Override
    public void delete(String id) {
        propertySetterRepo.deleteById(id);
    }
}