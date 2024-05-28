package com.itbd.application.services.erp.email;

import com.itbd.application.db.dao.notifications.NotificationRecipientDao;
import com.itbd.application.db.dto.notifications.NotificationRecipientDto;
import com.itbd.application.db.repos.NotificationRecipientRepository;
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
public class NotificationRecipientDtoCrudService implements CrudService<NotificationRecipientDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final NotificationRecipientRepository notificationRecipientRepo;

    public NotificationRecipientDtoCrudService(NotificationRecipientRepository notificationRecipientRepo, JpaFilterConverter jpaFilterConverter) {
        this.notificationRecipientRepo = notificationRecipientRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull NotificationRecipientDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<NotificationRecipientDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, NotificationRecipientDao.class)
                : Specification.anyOf();
        Page<NotificationRecipientDao> persons = notificationRecipientRepo.findAll(spec, pageable);
        return persons.stream().map(NotificationRecipientDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable NotificationRecipientDto save(NotificationRecipientDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        NotificationRecipientDao person = check
                ? notificationRecipientRepo.getReferenceById(value.name())
                : new NotificationRecipientDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        NotificationRecipientDto.fromDTO(value, person);
        return NotificationRecipientDto.fromEntity(notificationRecipientRepo.save(person));
    }

    @Override
    public void delete(String id) {
        notificationRecipientRepo.deleteById(id);
    }
}