package com.itbd.application.services.erp.email;

import com.itbd.application.db.dao.email.EmailAccountDao;
import com.itbd.application.db.dto.emails.EmailAccountDto;
import com.itbd.application.db.repos.EmailAccountRepository;
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
public class EmailAccountDtoCrudService implements CrudService<EmailAccountDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final EmailAccountRepository emailAccountRepo;

    public EmailAccountDtoCrudService(EmailAccountRepository emailAccountRepo, JpaFilterConverter jpaFilterConverter) {
        this.emailAccountRepo = emailAccountRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull EmailAccountDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<EmailAccountDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, EmailAccountDao.class)
                : Specification.anyOf();
        Page<EmailAccountDao> persons = emailAccountRepo.findAll(spec, pageable);
        return persons.stream().map(EmailAccountDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable EmailAccountDto save(EmailAccountDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        EmailAccountDao person = check
                ? emailAccountRepo.getReferenceById(value.name())
                : new EmailAccountDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        EmailAccountDto.fromDTO(value, person);
        return EmailAccountDto.fromEntity(emailAccountRepo.save(person));
    }

    @Override
    public void delete(String id) {
        emailAccountRepo.deleteById(id);
    }
}