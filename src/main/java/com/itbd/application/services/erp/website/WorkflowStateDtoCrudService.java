package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.workflow.WorkflowStateDao;
import com.itbd.application.db.dto.workflow.WorkflowStateDto;
import com.itbd.application.db.repos.WorkflowStateRepository;
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
public class WorkflowStateDtoCrudService implements CrudService<WorkflowStateDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WorkflowStateRepository workflowStateRepo;

    public WorkflowStateDtoCrudService(WorkflowStateRepository workflowStateRepo, JpaFilterConverter jpaFilterConverter) {
        this.workflowStateRepo = workflowStateRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WorkflowStateDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WorkflowStateDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WorkflowStateDao.class)
                : Specification.anyOf();
        Page<WorkflowStateDao> persons = workflowStateRepo.findAll(spec, pageable);
        return persons.stream().map(WorkflowStateDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WorkflowStateDto save(WorkflowStateDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WorkflowStateDao person = check
                ? workflowStateRepo.getReferenceById(value.name())
                : new WorkflowStateDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WorkflowStateDto.fromDTO(value, person);
        return WorkflowStateDto.fromEntity(workflowStateRepo.save(person));
    }

    @Override
    public void delete(String id) {
        workflowStateRepo.deleteById(id);
    }
}