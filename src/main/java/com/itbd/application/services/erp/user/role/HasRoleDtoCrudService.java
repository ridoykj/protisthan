package com.itbd.application.services.erp.user.role;

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

    @Override
    public void delete(String id) {
        hasRoleRepo.deleteById(id);
    }
}