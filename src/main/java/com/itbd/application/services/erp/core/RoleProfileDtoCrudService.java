package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.RoleProfileDao;
import com.itbd.application.db.dto.RoleProfileDto;
import com.itbd.application.db.repos.RoleProfileRepository;
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
public class RoleProfileDtoCrudService implements CrudService<RoleProfileDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final RoleProfileRepository roleProfileRepo;

    public RoleProfileDtoCrudService(RoleProfileRepository roleProfileRepo, JpaFilterConverter jpaFilterConverter) {
        this.roleProfileRepo = roleProfileRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull RoleProfileDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<RoleProfileDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, RoleProfileDao.class)
                : Specification.anyOf();
        Page<RoleProfileDao> persons = roleProfileRepo.findAll(spec, pageable);
        return persons.stream().map(RoleProfileDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable RoleProfileDto save(RoleProfileDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        RoleProfileDao person = check
                ? roleProfileRepo.getReferenceById(value.name())
                : new RoleProfileDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        RoleProfileDto.fromDTO(value, person);
        return RoleProfileDto.fromEntity(roleProfileRepo.save(person));
    }

    @Override
    public void delete(String id) {
        roleProfileRepo.deleteById(id);
    }
}