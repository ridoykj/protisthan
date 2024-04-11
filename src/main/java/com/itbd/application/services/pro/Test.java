package com.itbd.application.services.pro;

import com.itbd.application.db.dao.system.AuthDao;
import com.itbd.application.db.dto.AuthDto;
import com.itbd.application.db.repos.AuthRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import dev.hilla.Nonnull;
import dev.hilla.Nullable;
import dev.hilla.crud.CrudService;
import dev.hilla.crud.JpaFilterConverter;
import dev.hilla.crud.filter.Filter;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@BrowserCallable
@AnonymousAllowed
public class Test implements CrudService<AuthDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final AuthRepository authRepository;

    public Test(JpaFilterConverter jpaFilterConverter, AuthRepository authRepository) {
        this.jpaFilterConverter = jpaFilterConverter;
        this.authRepository = authRepository;
    }

    @Override
    @Nonnull
    public List<@Nonnull AuthDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<AuthDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, AuthDao.class)
                : Specification.anyOf();
        Page<AuthDao> authLs = authRepository.findAll(spec, pageable);
        return authLs.stream().map(AuthDto::asDTO).toList();
    }

    @Override
    @Transactional
    public @Nullable AuthDto save(AuthDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        AuthDao auth = check
                ? authRepository.getReferenceById(value.name())
                : new AuthDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        AuthDto.asEntity(value, auth);
        return AuthDto.asDTO(authRepository.save(auth));
    }

    @Override
    public void delete(String id) {
        authRepository.deleteById(id);
    }
}
