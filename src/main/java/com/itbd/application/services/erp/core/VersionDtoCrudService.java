package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.VersionDao;
import com.itbd.application.db.dto.VersionDto;
import com.itbd.application.db.repos.VersionRepository;
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
public class VersionDtoCrudService implements CrudService<VersionDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final VersionRepository versionRepo;

    public VersionDtoCrudService(VersionRepository versionRepo, JpaFilterConverter jpaFilterConverter) {
        this.versionRepo = versionRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull VersionDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<VersionDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, VersionDao.class)
                : Specification.anyOf();
        Page<VersionDao> persons = versionRepo.findAll(spec, pageable);
        return persons.stream().map(VersionDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable VersionDto save(VersionDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        VersionDao person = check
                ? versionRepo.getReferenceById(value.name())
                : new VersionDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        VersionDto.fromDTO(value, person);
        return VersionDto.fromEntity(versionRepo.save(person));
    }

    @Override
    public void delete(String id) {
        versionRepo.deleteById(id);
    }
}