package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.workspace.WorkspaceNumberCardDao;
import com.itbd.application.db.dto.workspace.WorkspaceNumberCardDto;
import com.itbd.application.db.repos.WorkspaceNumberCardRepository;
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
public class WorkspaceNumberCardDtoCrudService implements CrudService<WorkspaceNumberCardDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WorkspaceNumberCardRepository workspaceNumberCardRepo;

    public WorkspaceNumberCardDtoCrudService(WorkspaceNumberCardRepository workspaceNumberCardRepo, JpaFilterConverter jpaFilterConverter) {
        this.workspaceNumberCardRepo = workspaceNumberCardRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WorkspaceNumberCardDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WorkspaceNumberCardDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WorkspaceNumberCardDao.class)
                : Specification.anyOf();
        Page<WorkspaceNumberCardDao> persons = workspaceNumberCardRepo.findAll(spec, pageable);
        return persons.stream().map(WorkspaceNumberCardDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WorkspaceNumberCardDto save(WorkspaceNumberCardDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WorkspaceNumberCardDao person = check
                ? workspaceNumberCardRepo.getReferenceById(value.name())
                : new WorkspaceNumberCardDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WorkspaceNumberCardDto.fromDTO(value, person);
        return WorkspaceNumberCardDto.fromEntity(workspaceNumberCardRepo.save(person));
    }

    @Override
    public void delete(String id) {
        workspaceNumberCardRepo.deleteById(id);
    }
}