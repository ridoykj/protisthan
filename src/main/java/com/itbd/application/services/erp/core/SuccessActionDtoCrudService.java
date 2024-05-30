package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.SuccessActionDao;
import com.itbd.application.db.dto.SuccessActionDto;
import com.itbd.application.db.repos.SuccessActionRepository;
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
public class SuccessActionDtoCrudService implements CrudService<SuccessActionDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SuccessActionRepository successActionRepo;

    public SuccessActionDtoCrudService(SuccessActionRepository successActionRepo, JpaFilterConverter jpaFilterConverter) {
        this.successActionRepo = successActionRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SuccessActionDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SuccessActionDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SuccessActionDao.class)
                : Specification.anyOf();
        Page<SuccessActionDao> persons = successActionRepo.findAll(spec, pageable);
        return persons.stream().map(SuccessActionDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SuccessActionDto save(SuccessActionDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SuccessActionDao person = check
                ? successActionRepo.getReferenceById(value.name())
                : new SuccessActionDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SuccessActionDto.fromDTO(value, person);
        return SuccessActionDto.fromEntity(successActionRepo.save(person));
    }

    @Override
    public void delete(String id) {
        successActionRepo.deleteById(id);
    }
}