package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.ScheduledJobLogDao;
import com.itbd.application.db.dto.ScheduledJobLogDto;
import com.itbd.application.db.repos.ScheduledJobLogRepository;
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
public class ScheduledJobLogDtoCrudService implements CrudService<ScheduledJobLogDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ScheduledJobLogRepository scheduledJobLogRepo;

    public ScheduledJobLogDtoCrudService(ScheduledJobLogRepository reportRepo, JpaFilterConverter jpaFilterConverter) {
        this.scheduledJobLogRepo = reportRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ScheduledJobLogDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ScheduledJobLogDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ScheduledJobLogDao.class)
                : Specification.anyOf();
        Page<ScheduledJobLogDao> persons = scheduledJobLogRepo.findAll(spec, pageable);
        return persons.stream().map(ScheduledJobLogDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ScheduledJobLogDto save(ScheduledJobLogDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ScheduledJobLogDao person = check
                ? scheduledJobLogRepo.getReferenceById(value.name())
                : new ScheduledJobLogDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ScheduledJobLogDto.fromDTO(value, person);
        return ScheduledJobLogDto.fromEntity(scheduledJobLogRepo.save(person));
    }

    @Override
    public void delete(String id) {
        scheduledJobLogRepo.deleteById(id);
    }
}