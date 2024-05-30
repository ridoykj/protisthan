package com.itbd.application.services.erp.projects;

import com.itbd.application.db.dao.projects.ActivityTypeDao;
import com.itbd.application.db.dto.activitys.ActivityTypeDto;
import com.itbd.application.db.repos.ActivityTypeRepository;
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
public class ActivityTypeDtoCrudService implements CrudService<ActivityTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ActivityTypeRepository activityTypeRepo;

    public ActivityTypeDtoCrudService(ActivityTypeRepository activityTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.activityTypeRepo = activityTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ActivityTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ActivityTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ActivityTypeDao.class)
                : Specification.anyOf();
        Page<ActivityTypeDao> persons = activityTypeRepo.findAll(spec, pageable);
        return persons.stream().map(ActivityTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ActivityTypeDto save(ActivityTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ActivityTypeDao person = check
                ? activityTypeRepo.getReferenceById(value.name())
                : new ActivityTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ActivityTypeDto.fromDTO(value, person);
        return ActivityTypeDto.fromEntity(activityTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        activityTypeRepo.deleteById(id);
    }
}