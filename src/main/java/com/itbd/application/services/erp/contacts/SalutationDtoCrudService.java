package com.itbd.application.services.erp.contacts;

import com.itbd.application.db.dao.contacts.SalutationDao;
import com.itbd.application.db.dto.SalutationDto;
import com.itbd.application.db.repos.SalutationRepository;
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
public class SalutationDtoCrudService implements CrudService<SalutationDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalutationRepository salutationRepos;

    public SalutationDtoCrudService(SalutationRepository salutationRepos, JpaFilterConverter jpaFilterConverter) {
        this.salutationRepos = salutationRepos;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalutationDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalutationDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalutationDao.class)
                : Specification.anyOf();
        Page<SalutationDao> persons = salutationRepos.findAll(spec, pageable);
        return persons.stream().map(SalutationDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalutationDto save(SalutationDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalutationDao person = check
                ? salutationRepos.getReferenceById(value.name())
                : new SalutationDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalutationDto.fromDTO(value, person);
        return SalutationDto.fromEntity(salutationRepos.save(person));
    }

    @Override
    public void delete(String id) {
        salutationRepos.deleteById(id);
    }
}