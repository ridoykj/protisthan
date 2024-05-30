package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.setup.DepartmentDao;
import com.itbd.application.db.dto.DepartmentDto;
import com.itbd.application.db.repos.DepartmentRepository;
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
public class DepartmentDtoCrudService implements CrudService<DepartmentDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DepartmentRepository departmentRepo;

    public DepartmentDtoCrudService(DepartmentRepository departmentRepo, JpaFilterConverter jpaFilterConverter) {
        this.departmentRepo = departmentRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DepartmentDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DepartmentDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DepartmentDao.class)
                : Specification.anyOf();
        Page<DepartmentDao> persons = departmentRepo.findAll(spec, pageable);
        return persons.stream().map(DepartmentDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DepartmentDto save(DepartmentDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DepartmentDao person = check
                ? departmentRepo.getReferenceById(value.name())
                : new DepartmentDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DepartmentDto.fromDTO(value, person);
        return DepartmentDto.fromEntity(departmentRepo.save(person));
    }

    @Override
    public void delete(String id) {
        departmentRepo.deleteById(id);
    }
}