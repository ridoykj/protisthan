package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.workflow.WorkflowActionMasterDao;
import com.itbd.application.db.dto.workflow.WorkflowActionMasterDto;
import com.itbd.application.db.repos.WorkflowActionMasterRepository;
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
public class WorkflowActionMasterDtoCrudService implements CrudService<WorkflowActionMasterDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WorkflowActionMasterRepository workflowActionMasterRepo;

    public WorkflowActionMasterDtoCrudService(WorkflowActionMasterRepository workflowActionMasterRepo, JpaFilterConverter jpaFilterConverter) {
        this.workflowActionMasterRepo = workflowActionMasterRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WorkflowActionMasterDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WorkflowActionMasterDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WorkflowActionMasterDao.class)
                : Specification.anyOf();
        Page<WorkflowActionMasterDao> persons = workflowActionMasterRepo.findAll(spec, pageable);
        return persons.stream().map(WorkflowActionMasterDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WorkflowActionMasterDto save(WorkflowActionMasterDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WorkflowActionMasterDao person = check
                ? workflowActionMasterRepo.getReferenceById(value.name())
                : new WorkflowActionMasterDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WorkflowActionMasterDto.fromDTO(value, person);
        return WorkflowActionMasterDto.fromEntity(workflowActionMasterRepo.save(person));
    }

    @Override
    public void delete(String id) {
        workflowActionMasterRepo.deleteById(id);
    }
}