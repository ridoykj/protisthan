package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.HasRoleDao;
import com.itbd.application.db.dto.HasRoleDto;
import com.itbd.application.db.repos.HasRoleRepository;
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
public class HasRoleDtoCrudService implements CrudService<HasRoleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final HasRoleRepository hasRoleRepo;

    public HasRoleDtoCrudService(HasRoleRepository hasRoleRepo, JpaFilterConverter jpaFilterConverter) {
        this.hasRoleRepo = hasRoleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull HasRoleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<HasRoleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, HasRoleDao.class)
                : Specification.anyOf();
        Page<HasRoleDao> persons = hasRoleRepo.findAll(spec, pageable);
        return persons.stream().map(HasRoleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable HasRoleDto save(HasRoleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        HasRoleDao person = check
                ? hasRoleRepo.getReferenceById(value.name())
                : new HasRoleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        HasRoleDto.fromDTO(value, person);
        return HasRoleDto.fromEntity(hasRoleRepo.save(person));
    }

    @Transactional
    public List<HasRoleDao> saveAll(List<HasRoleDto> values) {
//        boolean check = value.name() != null && !value.name().isEmpty();
//        HasRoleDao person = check
//                ? hasRoleRepo.getReferenceById(value.name())
//                : new HasRoleDao();
//
//        // person.setRecordComment(check ? "UPDATE" : "NEW");
//        HasRoleDto.fromDTO(value, person);
        List<HasRoleDao> ii = values.stream().map(item -> {
            HasRoleDao hasRoleDao = new HasRoleDao();
            HasRoleDto.fromDTO(item, hasRoleDao);
            return hasRoleDao;
        }).toList();

        return hasRoleRepo.saveAll(ii);
    }

    @Override
    public void delete(String id) {
        hasRoleRepo.deleteById(id);
    }

    public void deleteWithNames(List<String> names) {
        hasRoleRepo.deleteAllById(names);
    }
}