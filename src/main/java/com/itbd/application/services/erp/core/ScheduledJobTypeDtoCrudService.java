package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.ScheduledJobTypeDao;
import com.itbd.application.db.dto.ScheduledJobTypeDto;
import com.itbd.application.db.repos.ScheduledJobTypeRepository;
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
public class ScheduledJobTypeDtoCrudService implements CrudService<ScheduledJobTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ScheduledJobTypeRepository scheduledJobTypeRepo;

    public ScheduledJobTypeDtoCrudService(ScheduledJobTypeRepository scheduledJobTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.scheduledJobTypeRepo = scheduledJobTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ScheduledJobTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ScheduledJobTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ScheduledJobTypeDao.class)
                : Specification.anyOf();
        Page<ScheduledJobTypeDao> persons = scheduledJobTypeRepo.findAll(spec, pageable);
        return persons.stream().map(ScheduledJobTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ScheduledJobTypeDto save(ScheduledJobTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ScheduledJobTypeDao person = check
                ? scheduledJobTypeRepo.getReferenceById(value.name())
                : new ScheduledJobTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ScheduledJobTypeDto.fromDTO(value, person);
        return ScheduledJobTypeDto.fromEntity(scheduledJobTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        scheduledJobTypeRepo.deleteById(id);
    }
}