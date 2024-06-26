package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.user.UserDao;
import com.itbd.application.db.dto.users.UserDto;
import com.itbd.application.db.repos.UserRepository;
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
public class UserDtoCrudService implements CrudService<UserDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final UserRepository userRepo;

    public UserDtoCrudService(UserRepository userRepo, JpaFilterConverter jpaFilterConverter) {
        this.userRepo = userRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull UserDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<UserDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, UserDao.class)
                : Specification.anyOf();
        Page<UserDao> persons = userRepo.findAll(spec, pageable);
        return persons.stream().map(UserDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable UserDto save(UserDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        UserDao person = check
                ? userRepo.getReferenceById(value.name())
                : new UserDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        UserDto.fromDTO(value, person);
        return UserDto.fromEntity(userRepo.save(person));
    }

    @Override
    public void delete(String id) {
        userRepo.deleteById(id);
    }
}