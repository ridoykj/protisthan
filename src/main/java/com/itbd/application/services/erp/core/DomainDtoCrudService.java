package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.DomainDao;
import com.itbd.application.db.dto.DomainDto;
import com.itbd.application.db.repos.DomainRepository;
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
public class DomainDtoCrudService implements CrudService<DomainDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DomainRepository domainRepo;

    public DomainDtoCrudService(DomainRepository domainRepo, JpaFilterConverter jpaFilterConverter) {
        this.domainRepo = domainRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DomainDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DomainDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DomainDao.class)
                : Specification.anyOf();
        Page<DomainDao> persons = domainRepo.findAll(spec, pageable);
        return persons.stream().map(DomainDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DomainDto save(DomainDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DomainDao person = check
                ? domainRepo.getReferenceById(value.name())
                : new DomainDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DomainDto.fromDTO(value, person);
        return DomainDto.fromEntity(domainRepo.save(person));
    }

    @Override
    public void delete(String id) {
        domainRepo.deleteById(id);
    }
}