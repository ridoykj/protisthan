package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.workspace.WorkspaceLinkDao;
import com.itbd.application.db.dto.workspace.WorkspaceLinkDto;
import com.itbd.application.db.repos.WorkspaceLinkRepository;
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
public class WorkspaceLinkDtoCrudService implements CrudService<WorkspaceLinkDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WorkspaceLinkRepository workspaceLinkRepo;

    public WorkspaceLinkDtoCrudService(WorkspaceLinkRepository workspaceLinkRepo, JpaFilterConverter jpaFilterConverter) {
        this.workspaceLinkRepo = workspaceLinkRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WorkspaceLinkDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WorkspaceLinkDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WorkspaceLinkDao.class)
                : Specification.anyOf();
        Page<WorkspaceLinkDao> persons = workspaceLinkRepo.findAll(spec, pageable);
        return persons.stream().map(WorkspaceLinkDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WorkspaceLinkDto save(WorkspaceLinkDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WorkspaceLinkDao person = check
                ? workspaceLinkRepo.getReferenceById(value.name())
                : new WorkspaceLinkDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WorkspaceLinkDto.fromDTO(value, person);
        return WorkspaceLinkDto.fromEntity(workspaceLinkRepo.save(person));
    }

    @Override
    public void delete(String id) {
        workspaceLinkRepo.deleteById(id);
    }
}