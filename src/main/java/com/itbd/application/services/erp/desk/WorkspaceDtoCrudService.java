package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.workspace.WorkspaceDao;
import com.itbd.application.db.dto.workspace.WorkspaceDto;
import com.itbd.application.db.repos.WorkspaceRepository;
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
public class WorkspaceDtoCrudService implements CrudService<WorkspaceDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WorkspaceRepository workspaceRepo;

    public WorkspaceDtoCrudService(WorkspaceRepository workspaceRepo, JpaFilterConverter jpaFilterConverter) {
        this.workspaceRepo = workspaceRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WorkspaceDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WorkspaceDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WorkspaceDao.class)
                : Specification.anyOf();
        Page<WorkspaceDao> persons = workspaceRepo.findAll(spec, pageable);
        return persons.stream().map(WorkspaceDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WorkspaceDto save(WorkspaceDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WorkspaceDao person = check
                ? workspaceRepo.getReferenceById(value.name())
                : new WorkspaceDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WorkspaceDto.fromDTO(value, person);
        return WorkspaceDto.fromEntity(workspaceRepo.save(person));
    }

    @Override
    public void delete(String id) {
        workspaceRepo.deleteById(id);
    }
}