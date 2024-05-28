package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.IncotermDao;
import com.itbd.application.db.dto.IncotermDto;
import com.itbd.application.db.repos.IncotermRepository;
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
public class IncotermDtoCrudService implements CrudService<IncotermDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final IncotermRepository incotermRepo;

    public IncotermDtoCrudService(IncotermRepository incotermRepo, JpaFilterConverter jpaFilterConverter) {
        this.incotermRepo = incotermRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull IncotermDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<IncotermDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, IncotermDao.class)
                : Specification.anyOf();
        Page<IncotermDao> persons = incotermRepo.findAll(spec, pageable);
        return persons.stream().map(IncotermDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable IncotermDto save(IncotermDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        IncotermDao person = check
                ? incotermRepo.getReferenceById(value.name())
                : new IncotermDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        IncotermDto.fromDTO(value, person);
        return IncotermDto.fromEntity(incotermRepo.save(person));
    }

    @Override
    public void delete(String id) {
        incotermRepo.deleteById(id);
    }
}