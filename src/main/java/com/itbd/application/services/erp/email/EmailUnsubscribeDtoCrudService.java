package com.itbd.application.services.erp.email;

import com.itbd.application.db.dao.emails.EmailUnsubscribeDao;
import com.itbd.application.db.dto.emails.EmailUnsubscribeDto;
import com.itbd.application.db.repos.EmailUnsubscribeRepository;
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
public class EmailUnsubscribeDtoCrudService implements CrudService<EmailUnsubscribeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final EmailUnsubscribeRepository emailUnsubscribeRepo;

    public EmailUnsubscribeDtoCrudService(EmailUnsubscribeRepository emailUnsubscribeRepo, JpaFilterConverter jpaFilterConverter) {
        this.emailUnsubscribeRepo = emailUnsubscribeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull EmailUnsubscribeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<EmailUnsubscribeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, EmailUnsubscribeDao.class)
                : Specification.anyOf();
        Page<EmailUnsubscribeDao> persons = emailUnsubscribeRepo.findAll(spec, pageable);
        return persons.stream().map(EmailUnsubscribeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable EmailUnsubscribeDto save(EmailUnsubscribeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        EmailUnsubscribeDao person = check
                ? emailUnsubscribeRepo.getReferenceById(value.name())
                : new EmailUnsubscribeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        EmailUnsubscribeDto.fromDTO(value, person);
        return EmailUnsubscribeDto.fromEntity(emailUnsubscribeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        emailUnsubscribeRepo.deleteById(id);
    }
}