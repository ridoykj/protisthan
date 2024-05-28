package com.itbd.application.services.erp.contacts;

import com.itbd.application.db.dao.GenderDao;
import com.itbd.application.db.dto.GenderDto;
import com.itbd.application.db.repos.GenderRepository;
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
public class GenderDtoCrudService implements CrudService<GenderDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final GenderRepository genderRepo;

    public GenderDtoCrudService(GenderRepository genderRepo, JpaFilterConverter jpaFilterConverter) {
        this.genderRepo = genderRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull GenderDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<GenderDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, GenderDao.class)
                : Specification.anyOf();
        Page<GenderDao> persons = genderRepo.findAll(spec, pageable);
        return persons.stream().map(GenderDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable GenderDto save(GenderDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        GenderDao person = check
                ? genderRepo.getReferenceById(value.name())
                : new GenderDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        GenderDto.fromDTO(value, person);
        return GenderDto.fromEntity(genderRepo.save(person));
    }

    @Override
    public void delete(String id) {
        genderRepo.deleteById(id);
    }
}