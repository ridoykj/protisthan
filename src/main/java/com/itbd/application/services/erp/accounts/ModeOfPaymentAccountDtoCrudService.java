package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.ModeOfPaymentAccountDao;
import com.itbd.application.db.dto.ModeOfPaymentAccountDto;
import com.itbd.application.db.repos.ModeOfPaymentAccountRepository;
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
public class ModeOfPaymentAccountDtoCrudService implements CrudService<ModeOfPaymentAccountDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ModeOfPaymentAccountRepository modeOfPaymentAccountRepo;

    public ModeOfPaymentAccountDtoCrudService(ModeOfPaymentAccountRepository modeOfPaymentAccountRepo, JpaFilterConverter jpaFilterConverter) {
        this.modeOfPaymentAccountRepo = modeOfPaymentAccountRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ModeOfPaymentAccountDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ModeOfPaymentAccountDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ModeOfPaymentAccountDao.class)
                : Specification.anyOf();
        Page<ModeOfPaymentAccountDao> persons = modeOfPaymentAccountRepo.findAll(spec, pageable);
        return persons.stream().map(ModeOfPaymentAccountDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ModeOfPaymentAccountDto save(ModeOfPaymentAccountDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ModeOfPaymentAccountDao person = check
                ? modeOfPaymentAccountRepo.getReferenceById(value.name())
                : new ModeOfPaymentAccountDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ModeOfPaymentAccountDto.fromDTO(value, person);
        return ModeOfPaymentAccountDto.fromEntity(modeOfPaymentAccountRepo.save(person));
    }

    @Override
    public void delete(String id) {
        modeOfPaymentAccountRepo.deleteById(id);
    }
}