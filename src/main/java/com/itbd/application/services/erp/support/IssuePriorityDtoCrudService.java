package com.itbd.application.services.erp.support;

import com.itbd.application.db.dao.issues.IssuePriorityDao;
import com.itbd.application.db.dto.issues.IssuePriorityDto;
import com.itbd.application.db.repos.IssuePriorityRepository;
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
public class IssuePriorityDtoCrudService implements CrudService<IssuePriorityDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final IssuePriorityRepository issuePriorityRepo;

    public IssuePriorityDtoCrudService(IssuePriorityRepository issuePriorityRepo, JpaFilterConverter jpaFilterConverter) {
        this.issuePriorityRepo = issuePriorityRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull IssuePriorityDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<IssuePriorityDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, IssuePriorityDao.class)
                : Specification.anyOf();
        Page<IssuePriorityDao> persons = issuePriorityRepo.findAll(spec, pageable);
        return persons.stream().map(IssuePriorityDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable IssuePriorityDto save(IssuePriorityDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        IssuePriorityDao person = check
                ? issuePriorityRepo.getReferenceById(value.name())
                : new IssuePriorityDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        IssuePriorityDto.fromDTO(value, person);
        return IssuePriorityDto.fromEntity(issuePriorityRepo.save(person));
    }

    @Override
    public void delete(String id) {
        issuePriorityRepo.deleteById(id);
    }
}