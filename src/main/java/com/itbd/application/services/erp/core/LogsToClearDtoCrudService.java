package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.LogsToClearDao;
import com.itbd.application.db.dto.LogsToClearDto;
import com.itbd.application.db.repos.LogsToClearRepository;
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
public class LogsToClearDtoCrudService implements CrudService<LogsToClearDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final LogsToClearRepository logsToClearRepo;

    public LogsToClearDtoCrudService(LogsToClearRepository logsToClearRepo, JpaFilterConverter jpaFilterConverter) {
        this.logsToClearRepo = logsToClearRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull LogsToClearDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<LogsToClearDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, LogsToClearDao.class)
                : Specification.anyOf();
        Page<LogsToClearDao> persons = logsToClearRepo.findAll(spec, pageable);
        return persons.stream().map(LogsToClearDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable LogsToClearDto save(LogsToClearDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        LogsToClearDao person = check
                ? logsToClearRepo.getReferenceById(value.name())
                : new LogsToClearDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        LogsToClearDto.fromDTO(value, person);
        return LogsToClearDto.fromEntity(logsToClearRepo.save(person));
    }

    @Override
    public void delete(String id) {
        logsToClearRepo.deleteById(id);
    }
}