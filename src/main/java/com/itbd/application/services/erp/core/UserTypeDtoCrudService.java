package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.users.UserTypeDao;
import com.itbd.application.db.dto.users.UserTypeDto;
import com.itbd.application.db.repos.UserTypeRepository;
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
public class UserTypeDtoCrudService implements CrudService<UserTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final UserTypeRepository userTypeRepo;

    public UserTypeDtoCrudService(UserTypeRepository userTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.userTypeRepo = userTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull UserTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<UserTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, UserTypeDao.class)
                : Specification.anyOf();
        Page<UserTypeDao> persons = userTypeRepo.findAll(spec, pageable);
        return persons.stream().map(UserTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable UserTypeDto save(UserTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        UserTypeDao person = check
                ? userTypeRepo.getReferenceById(value.name())
                : new UserTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        UserTypeDto.fromDTO(value, person);
        return UserTypeDto.fromEntity(userTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        userTypeRepo.deleteById(id);
    }
}