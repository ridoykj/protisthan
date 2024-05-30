package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.ModeOfPaymentDao;
import com.itbd.application.db.dto.ModeOfPaymentDto;
import com.itbd.application.db.repos.ModeOfPaymentRepository;
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
public class ModeOfPaymentDtoCrudService implements CrudService<ModeOfPaymentDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ModeOfPaymentRepository modeOfPaymentRepo;

    public ModeOfPaymentDtoCrudService(ModeOfPaymentRepository modeOfPaymentRepo, JpaFilterConverter jpaFilterConverter) {
        this.modeOfPaymentRepo = modeOfPaymentRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ModeOfPaymentDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ModeOfPaymentDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ModeOfPaymentDao.class)
                : Specification.anyOf();
        Page<ModeOfPaymentDao> persons = modeOfPaymentRepo.findAll(spec, pageable);
        return persons.stream().map(ModeOfPaymentDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ModeOfPaymentDto save(ModeOfPaymentDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ModeOfPaymentDao person = check
                ? modeOfPaymentRepo.getReferenceById(value.name())
                : new ModeOfPaymentDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ModeOfPaymentDto.fromDTO(value, person);
        return ModeOfPaymentDto.fromEntity(modeOfPaymentRepo.save(person));
    }

    @Override
    public void delete(String id) {
        modeOfPaymentRepo.deleteById(id);
    }
}