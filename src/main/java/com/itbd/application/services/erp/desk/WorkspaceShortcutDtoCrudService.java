package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.workspace.WorkspaceShortcutDao;
import com.itbd.application.db.dto.workspace.WorkspaceShortcutDto;
import com.itbd.application.db.repos.WorkspaceShortcutRepository;
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
public class WorkspaceShortcutDtoCrudService implements CrudService<WorkspaceShortcutDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WorkspaceShortcutRepository workspaceShortcutRepo;

    public WorkspaceShortcutDtoCrudService(WorkspaceShortcutRepository workspaceShortcutRepo, JpaFilterConverter jpaFilterConverter) {
        this.workspaceShortcutRepo = workspaceShortcutRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WorkspaceShortcutDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WorkspaceShortcutDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WorkspaceShortcutDao.class)
                : Specification.anyOf();
        Page<WorkspaceShortcutDao> persons = workspaceShortcutRepo.findAll(spec, pageable);
        return persons.stream().map(WorkspaceShortcutDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WorkspaceShortcutDto save(WorkspaceShortcutDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WorkspaceShortcutDao person = check
                ? workspaceShortcutRepo.getReferenceById(value.name())
                : new WorkspaceShortcutDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WorkspaceShortcutDto.fromDTO(value, person);
        return WorkspaceShortcutDto.fromEntity(workspaceShortcutRepo.save(person));
    }

    @Override
    public void delete(String id) {
        workspaceShortcutRepo.deleteById(id);
    }
}