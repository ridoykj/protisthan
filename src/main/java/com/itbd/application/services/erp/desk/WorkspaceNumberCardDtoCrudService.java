package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.workspace.WorkspaceChartDao;
import com.itbd.application.db.dto.workspace.WorkspaceChartDto;
import com.itbd.application.db.repos.WorkspaceChartRepository;
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
public class WorkspaceChartDtoCrudService implements CrudService<WorkspaceChartDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WorkspaceChartRepository workspaceChartRepos;

    public WorkspaceChartDtoCrudService(WorkspaceChartRepository workspaceChartRepos, JpaFilterConverter jpaFilterConverter) {
        this.workspaceChartRepos = workspaceChartRepos;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WorkspaceChartDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WorkspaceChartDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WorkspaceChartDao.class)
                : Specification.anyOf();
        Page<WorkspaceChartDao> persons = workspaceChartRepos.findAll(spec, pageable);
        return persons.stream().map(WorkspaceChartDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WorkspaceChartDto save(WorkspaceChartDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WorkspaceChartDao person = check
                ? workspaceChartRepos.getReferenceById(value.name())
                : new WorkspaceChartDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WorkspaceChartDto.fromDTO(value, person);
        return WorkspaceChartDto.fromEntity(workspaceChartRepos.save(person));
    }

    @Override
    public void delete(String id) {
        workspaceChartRepos.deleteById(id);
    }
}