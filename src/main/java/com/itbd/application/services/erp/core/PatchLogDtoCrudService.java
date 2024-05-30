package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.PatchLogDao;
import com.itbd.application.db.dto.PatchLogDto;
import com.itbd.application.db.repos.PatchLogRepository;
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
public class PatchLogDtoCrudService implements CrudService<PatchLogDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PatchLogRepository patchLogRepo;

    public PatchLogDtoCrudService(PatchLogRepository pageRepo, JpaFilterConverter jpaFilterConverter) {
        this.patchLogRepo = pageRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PatchLogDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PatchLogDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PatchLogDao.class)
                : Specification.anyOf();
        Page<PatchLogDao> persons = patchLogRepo.findAll(spec, pageable);
        return persons.stream().map(PatchLogDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PatchLogDto save(PatchLogDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PatchLogDao person = check
                ? patchLogRepo.getReferenceById(value.name())
                : new PatchLogDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PatchLogDto.fromDTO(value, person);
        return PatchLogDto.fromEntity(patchLogRepo.save(person));
    }

    @Override
    public void delete(String id) {
        patchLogRepo.deleteById(id);
    }
}