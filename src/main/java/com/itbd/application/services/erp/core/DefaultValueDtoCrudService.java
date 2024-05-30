package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.DefaultValueDao;
import com.itbd.application.db.dto.DefaultValueDto;
import com.itbd.application.db.repos.DefaultValueRepository;
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
public class DefaultValueDtoCrudService implements CrudService<DefaultValueDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DefaultValueRepository defaultValueRepo;

    public DefaultValueDtoCrudService(DefaultValueRepository defaultValueRepo, JpaFilterConverter jpaFilterConverter) {
        this.defaultValueRepo = defaultValueRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DefaultValueDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DefaultValueDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DefaultValueDao.class)
                : Specification.anyOf();
        Page<DefaultValueDao> persons = defaultValueRepo.findAll(spec, pageable);
        return persons.stream().map(DefaultValueDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DefaultValueDto save(DefaultValueDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DefaultValueDao person = check
                ? defaultValueRepo.getReferenceById(value.name())
                : new DefaultValueDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DefaultValueDto.fromDTO(value, person);
        return DefaultValueDto.fromEntity(defaultValueRepo.save(person));
    }

    @Override
    public void delete(String id) {
        defaultValueRepo.deleteById(id);
    }
}