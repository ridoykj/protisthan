package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.process.ProcessDeferredAccountingDao;
import com.itbd.application.db.dto.ProcessDeferredAccountingDto;
import com.itbd.application.db.repos.ProcessDeferredAccountingRepository;
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
public class ProcessDeferredAccountingDtoCrudService implements CrudService<ProcessDeferredAccountingDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ProcessDeferredAccountingRepository processDeferredAccountingRepo;

    public ProcessDeferredAccountingDtoCrudService(ProcessDeferredAccountingRepository processDeferredAccountingRepo, JpaFilterConverter jpaFilterConverter) {
        this.processDeferredAccountingRepo = processDeferredAccountingRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ProcessDeferredAccountingDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ProcessDeferredAccountingDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ProcessDeferredAccountingDao.class)
                : Specification.anyOf();
        Page<ProcessDeferredAccountingDao> persons = processDeferredAccountingRepo.findAll(spec, pageable);
        return persons.stream().map(ProcessDeferredAccountingDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ProcessDeferredAccountingDto save(ProcessDeferredAccountingDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ProcessDeferredAccountingDao person = check
                ? processDeferredAccountingRepo.getReferenceById(value.name())
                : new ProcessDeferredAccountingDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ProcessDeferredAccountingDto.fromDTO(value, person);
        return ProcessDeferredAccountingDto.fromEntity(processDeferredAccountingRepo.save(person));
    }

    @Override
    public void delete(String id) {
        processDeferredAccountingRepo.deleteById(id);
    }
}