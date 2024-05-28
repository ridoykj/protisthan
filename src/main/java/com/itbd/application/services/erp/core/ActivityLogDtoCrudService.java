package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.activitys.ActivityLogDao;
import com.itbd.application.db.dto.activitys.ActivityLogDto;
import com.itbd.application.db.repos.ActivityLogRepository;
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
public class ActivityLogDtoCrudService implements CrudService<ActivityLogDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ActivityLogRepository activityLogRepo;

    public ActivityLogDtoCrudService(ActivityLogRepository activityLogRepo, JpaFilterConverter jpaFilterConverter) {
        this.activityLogRepo = activityLogRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ActivityLogDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ActivityLogDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ActivityLogDao.class)
                : Specification.anyOf();
        Page<ActivityLogDao> persons = activityLogRepo.findAll(spec, pageable);
        return persons.stream().map(ActivityLogDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ActivityLogDto save(ActivityLogDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ActivityLogDao person = check
                ? activityLogRepo.getReferenceById(value.name())
                : new ActivityLogDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ActivityLogDto.fromDTO(value, person);
        return ActivityLogDto.fromEntity(activityLogRepo.save(person));
    }

    @Override
    public void delete(String id) {
        activityLogRepo.deleteById(id);
    }
}