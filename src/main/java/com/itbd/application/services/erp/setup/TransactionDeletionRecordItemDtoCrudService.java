package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.setup.TransactionDeletionRecordItemDao;
import com.itbd.application.db.dto.transactions.TransactionDeletionRecordItemDto;
import com.itbd.application.db.repos.TransactionDeletionRecordItemRepository;
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
public class TransactionDeletionRecordItemDtoCrudService implements CrudService<TransactionDeletionRecordItemDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final TransactionDeletionRecordItemRepository transactionDeletionRecordItemRepo;

    public TransactionDeletionRecordItemDtoCrudService(TransactionDeletionRecordItemRepository transactionDeletionRecordItemRepo, JpaFilterConverter jpaFilterConverter) {
        this.transactionDeletionRecordItemRepo = transactionDeletionRecordItemRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull TransactionDeletionRecordItemDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<TransactionDeletionRecordItemDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, TransactionDeletionRecordItemDao.class)
                : Specification.anyOf();
        Page<TransactionDeletionRecordItemDao> persons = transactionDeletionRecordItemRepo.findAll(spec, pageable);
        return persons.stream().map(TransactionDeletionRecordItemDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable TransactionDeletionRecordItemDto save(TransactionDeletionRecordItemDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        TransactionDeletionRecordItemDao person = check
                ? transactionDeletionRecordItemRepo.getReferenceById(value.name())
                : new TransactionDeletionRecordItemDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        TransactionDeletionRecordItemDto.fromDTO(value, person);
        return TransactionDeletionRecordItemDto.fromEntity(transactionDeletionRecordItemRepo.save(person));
    }

    @Override
    public void delete(String id) {
        transactionDeletionRecordItemRepo.deleteById(id);
    }
}