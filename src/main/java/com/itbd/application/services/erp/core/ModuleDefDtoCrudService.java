package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.modules.ModuleDefDao;
import com.itbd.application.db.dto.modules.ModuleDefDto;
import com.itbd.application.db.repos.ModuleDefRepository;
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
public class ModuleDefDtoCrudService implements CrudService<ModuleDefDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ModuleDefRepository moduleDefRepo;

    public ModuleDefDtoCrudService(ModuleDefRepository moduleDefRepo, JpaFilterConverter jpaFilterConverter) {
        this.moduleDefRepo = moduleDefRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ModuleDefDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ModuleDefDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ModuleDefDao.class)
                : Specification.anyOf();
        Page<ModuleDefDao> persons = moduleDefRepo.findAll(spec, pageable);
        return persons.stream().map(ModuleDefDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ModuleDefDto save(ModuleDefDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ModuleDefDao person = check
                ? moduleDefRepo.getReferenceById(value.name())
                : new ModuleDefDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ModuleDefDto.fromDTO(value, person);
        return ModuleDefDto.fromEntity(moduleDefRepo.save(person));
    }

    @Override
    public void delete(String id) {
        moduleDefRepo.deleteById(id);
    }
}