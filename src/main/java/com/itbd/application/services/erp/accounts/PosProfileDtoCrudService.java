package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.pos.PosProfileDao;
import com.itbd.application.db.dto.pos.PosProfileDto;
import com.itbd.application.db.repos.PosProfileRepository;
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
public class PosProfileDtoCrudService implements CrudService<PosProfileDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PosProfileRepository posProfileRepo;

    public PosProfileDtoCrudService(PosProfileRepository posProfileRepo, JpaFilterConverter jpaFilterConverter) {
        this.posProfileRepo = posProfileRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PosProfileDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PosProfileDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PosProfileDao.class)
                : Specification.anyOf();
        Page<PosProfileDao> persons = posProfileRepo.findAll(spec, pageable);
        return persons.stream().map(PosProfileDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PosProfileDto save(PosProfileDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PosProfileDao person = check
                ? posProfileRepo.getReferenceById(value.name())
                : new PosProfileDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PosProfileDto.fromDTO(value, person);
        return PosProfileDto.fromEntity(posProfileRepo.save(person));
    }

    @Override
    public void delete(String id) {
        posProfileRepo.deleteById(id);
    }
}