package com.itbd.application.services.erp.email;

import com.itbd.application.db.dao.email.NotificationDao;
import com.itbd.application.db.dto.notifications.NotificationDto;
import com.itbd.application.db.repos.NotificationRepository;
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
public class NotificationDtoCrudService implements CrudService<NotificationDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final NotificationRepository notificationRepo;

    public NotificationDtoCrudService(NotificationRepository notificationRepo, JpaFilterConverter jpaFilterConverter) {
        this.notificationRepo = notificationRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull NotificationDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<NotificationDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, NotificationDao.class)
                : Specification.anyOf();
        Page<NotificationDao> persons = notificationRepo.findAll(spec, pageable);
        return persons.stream().map(NotificationDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable NotificationDto save(NotificationDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        NotificationDao person = check
                ? notificationRepo.getReferenceById(value.name())
                : new NotificationDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        NotificationDto.fromDTO(value, person);
        return NotificationDto.fromEntity(notificationRepo.save(person));
    }

    @Override
    public void delete(String id) {
        notificationRepo.deleteById(id);
    }
}