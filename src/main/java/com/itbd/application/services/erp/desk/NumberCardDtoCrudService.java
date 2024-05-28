package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.notifications.NotificationSettingsDao;
import com.itbd.application.db.dto.notifications.NotificationSettingsDto;
import com.itbd.application.db.repos.NotificationSettingsRepository;
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
public class NotificationSettingsDtoCrudService implements CrudService<NotificationSettingsDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final NotificationSettingsRepository notificationSettingsRepo;

    public NotificationSettingsDtoCrudService(NotificationSettingsRepository notificationSettingsRepo, JpaFilterConverter jpaFilterConverter) {
        this.notificationSettingsRepo = notificationSettingsRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull NotificationSettingsDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<NotificationSettingsDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, NotificationSettingsDao.class)
                : Specification.anyOf();
        Page<NotificationSettingsDao> persons = notificationSettingsRepo.findAll(spec, pageable);
        return persons.stream().map(NotificationSettingsDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable NotificationSettingsDto save(NotificationSettingsDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        NotificationSettingsDao person = check
                ? notificationSettingsRepo.getReferenceById(value.name())
                : new NotificationSettingsDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        NotificationSettingsDto.fromDTO(value, person);
        return NotificationSettingsDto.fromEntity(notificationSettingsRepo.save(person));
    }

    @Override
    public void delete(String id) {
        notificationSettingsRepo.deleteById(id);
    }
}