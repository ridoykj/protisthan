package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.PartyTypeDao;
import com.itbd.application.db.dto.PartyTypeDto;
import com.itbd.application.db.repos.PartyTypeRepository;
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
public class PartyTypeDtoCrudService implements CrudService<PartyTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PartyTypeRepository partyTypeRepo;

    public PartyTypeDtoCrudService(PartyTypeRepository partyTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.partyTypeRepo = partyTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PartyTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PartyTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PartyTypeDao.class)
                : Specification.anyOf();
        Page<PartyTypeDao> persons = partyTypeRepo.findAll(spec, pageable);
        return persons.stream().map(PartyTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PartyTypeDto save(PartyTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PartyTypeDao person = check
                ? partyTypeRepo.getReferenceById(value.name())
                : new PartyTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PartyTypeDto.fromDTO(value, person);
        return PartyTypeDto.fromEntity(partyTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        partyTypeRepo.deleteById(id);
    }
}