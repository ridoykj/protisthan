package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.transactions.TransactionDeletionRecordDao;
import com.itbd.application.db.dto.transactions.TransactionDeletionRecordDto;
import com.itbd.application.db.repos.TransactionDeletionRecordRepository;
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
public class TransactionDeletionRecordDtoCrudService implements CrudService<TransactionDeletionRecordDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final TransactionDeletionRecordRepository transactionDeletionRecordRepo;

    public TransactionDeletionRecordDtoCrudService(TransactionDeletionRecordRepository transactionDeletionRecordRepo, JpaFilterConverter jpaFilterConverter) {
        this.transactionDeletionRecordRepo = transactionDeletionRecordRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull TransactionDeletionRecordDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<TransactionDeletionRecordDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, TransactionDeletionRecordDao.class)
                : Specification.anyOf();
        Page<TransactionDeletionRecordDao> persons = transactionDeletionRecordRepo.findAll(spec, pageable);
        return persons.stream().map(TransactionDeletionRecordDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable TransactionDeletionRecordDto save(TransactionDeletionRecordDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        TransactionDeletionRecordDao person = check
                ? transactionDeletionRecordRepo.getReferenceById(value.name())
                : new TransactionDeletionRecordDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        TransactionDeletionRecordDto.fromDTO(value, person);
        return TransactionDeletionRecordDto.fromEntity(transactionDeletionRecordRepo.save(person));
    }

    @Override
    public void delete(String id) {
        transactionDeletionRecordRepo.deleteById(id);
    }
}