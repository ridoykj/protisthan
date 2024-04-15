package com.itbd.application.services.erp;

import com.itbd.application.db.dao.RoleDao;
import com.itbd.application.db.dto.RoleDto;
import com.itbd.application.db.repos.RoleRepository;
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
public class RoleDtoCrudService implements CrudService<RoleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final RoleRepository roleRepo;

    public RoleDtoCrudService(RoleRepository roleRepo, JpaFilterConverter jpaFilterConverter) {
        this.roleRepo = roleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull RoleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<RoleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, RoleDao.class)
                : Specification.anyOf();
        Page<RoleDao> persons = roleRepo.findAll(spec, pageable);
        return persons.stream().map(RoleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable RoleDto save(RoleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        RoleDao person = check
                ? roleRepo.getReferenceById(value.name())
                : new RoleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        RoleDto.fromDTO(value, person);
        return RoleDto.fromEntity(roleRepo.save(person));
    }

    @Override
    public void delete(String id) {
        roleRepo.deleteById(id);
    }
}