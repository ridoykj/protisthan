package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.pos.PosOpeningEntryDao;
import com.itbd.application.db.dto.pos.PosOpeningEntryDto;
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
public class PosOpeningEntryDtoCrudService implements CrudService<PosOpeningEntryDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PosOpeningEntryRepository posOpeningEntryRepo;

    public PosOpeningEntryDtoCrudService(PosOpeningEntryRepository posOpeningEntryRepo, JpaFilterConverter jpaFilterConverter) {
        this.posOpeningEntryRepo = posOpeningEntryRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PosOpeningEntryDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PosOpeningEntryDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PosOpeningEntryDao.class)
                : Specification.anyOf();
        Page<PosOpeningEntryDao> persons = posOpeningEntryRepo.findAll(spec, pageable);
        return persons.stream().map(PosOpeningEntryDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PosOpeningEntryDto save(PosOpeningEntryDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PosOpeningEntryDao person = check
                ? posOpeningEntryRepo.getReferenceById(value.name())
                : new PosOpeningEntryDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PosOpeningEntryDto.fromDTO(value, person);
        return PosOpeningEntryDto.fromEntity(posOpeningEntryRepo.save(person));
    }

    @Override
    public void delete(String id) {
        posOpeningEntryRepo.deleteById(id);
    }
}