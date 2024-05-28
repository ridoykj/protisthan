package com.itbd.application.services.erp.selling.pointofsale;

import com.itbd.application.db.dao.pos.PosClosingEntryDao;
import com.itbd.application.db.dto.pos.PosClosingEntryDto;
import com.itbd.application.db.repos.PosClosingEntryRepository;
import com.itbd.application.db.repos.PosOpeningEntryRepository;
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
public class PosClosingEntryDtoCrudService implements CrudService<PosClosingEntryDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PosClosingEntryRepository posClosingEntryRepo;

    public PosClosingEntryDtoCrudService(PosClosingEntryRepository posClosingEntryRepo, JpaFilterConverter jpaFilterConverter) {
        this.posClosingEntryRepo = posClosingEntryRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PosClosingEntryDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PosClosingEntryDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PosClosingEntryDao.class)
                : Specification.anyOf();
        Page<PosClosingEntryDao> persons = posClosingEntryRepo.findAll(spec, pageable);
        return persons.stream().map(PosClosingEntryDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PosClosingEntryDto save(PosClosingEntryDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PosClosingEntryDao person = check
                ? posClosingEntryRepo.getReferenceById(value.name())
                : new PosClosingEntryDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PosClosingEntryDto.fromDTO(value, person);
        return PosClosingEntryDto.fromEntity(posClosingEntryRepo.save(person));
    }

    @Override
    public void delete(String id) {
        posClosingEntryRepo.deleteById(id);
    }
}