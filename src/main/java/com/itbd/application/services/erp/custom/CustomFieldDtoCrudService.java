package com.itbd.application.services.erp.custom;

import com.itbd.application.db.dao.custom.CustomFieldDao;
import com.itbd.application.db.dto.CustomFieldDto;
import com.itbd.application.db.repos.CustomFieldRepository;
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
public class CustomFieldDtoCrudService implements CrudService<CustomFieldDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CustomFieldRepository customFieldRepo;

    public CustomFieldDtoCrudService(CustomFieldRepository customFieldRepo, JpaFilterConverter jpaFilterConverter) {
        this.customFieldRepo = customFieldRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CustomFieldDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CustomFieldDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CustomFieldDao.class)
                : Specification.anyOf();
        Page<CustomFieldDao> persons = customFieldRepo.findAll(spec, pageable);
        return persons.stream().map(CustomFieldDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CustomFieldDto save(CustomFieldDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CustomFieldDao person = check
                ? customFieldRepo.getReferenceById(value.name())
                : new CustomFieldDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CustomFieldDto.fromDTO(value, person);
        return CustomFieldDto.fromEntity(customFieldRepo.save(person));
    }

    @Override
    public void delete(String id) {
        customFieldRepo.deleteById(id);
    }
}