package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.account.AccountDao;
import com.itbd.application.db.dto.accounts.AccountDto;
import com.itbd.application.db.repos.AccountRepository;
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
public class AccountDtoCrudService implements CrudService<AccountDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final AccountRepository accountRepo;

    public AccountDtoCrudService(AccountRepository accountRepo, JpaFilterConverter jpaFilterConverter) {
        this.accountRepo = accountRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull AccountDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<AccountDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, AccountDao.class)
                : Specification.anyOf();
        Page<AccountDao> persons = accountRepo.findAll(spec, pageable);
        return persons.stream().map(AccountDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable AccountDto save(AccountDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        AccountDao person = check
                ? accountRepo.getReferenceById(value.name())
                : new AccountDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        AccountDto.fromDTO(value, person);
        return AccountDto.fromEntity(accountRepo.save(person));
    }

    @Override
    public void delete(String id) {
        accountRepo.deleteById(id);
    }
}