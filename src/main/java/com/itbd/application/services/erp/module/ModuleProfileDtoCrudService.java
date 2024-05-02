package com.itbd.application.services.erp.module;

import com.itbd.application.db.dao.modules.ModuleProfileDao;
import com.itbd.application.db.dto.modules.ModuleProfileDto;
import com.itbd.application.db.repos.ModuleProfileRepository;
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
public class ModuleProfileDtoCrudService implements CrudService<ModuleProfileDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ModuleProfileRepository moduleProfileRepo;

    public ModuleProfileDtoCrudService(ModuleProfileRepository moduleProfileRepo, JpaFilterConverter jpaFilterConverter) {
        this.moduleProfileRepo = moduleProfileRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ModuleProfileDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ModuleProfileDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ModuleProfileDao.class)
                : Specification.anyOf();
        Page<ModuleProfileDao> persons = moduleProfileRepo.findAll(spec, pageable);
        return persons.stream().map(ModuleProfileDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ModuleProfileDto save(ModuleProfileDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ModuleProfileDao person = check
                ? moduleProfileRepo.getReferenceById(value.name())
                : new ModuleProfileDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ModuleProfileDto.fromDTO(value, person);
        return ModuleProfileDto.fromEntity(moduleProfileRepo.save(person));
    }

    @Override
    public void delete(String id) {
        moduleProfileRepo.deleteById(id);
    }
}