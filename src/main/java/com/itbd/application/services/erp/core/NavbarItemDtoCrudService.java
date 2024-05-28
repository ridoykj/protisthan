package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.LanguageDao;
import com.itbd.application.db.dto.LanguageDto;
import com.itbd.application.db.repos.LanguageRepository;
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
public class LanguageDtoCrudService implements CrudService<LanguageDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final LanguageRepository languageRepo;

    public LanguageDtoCrudService(LanguageRepository languageRepo, JpaFilterConverter jpaFilterConverter) {
        this.languageRepo = languageRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull LanguageDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<LanguageDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, LanguageDao.class)
                : Specification.anyOf();
        Page<LanguageDao> persons = languageRepo.findAll(spec, pageable);
        return persons.stream().map(LanguageDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable LanguageDto save(LanguageDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        LanguageDao person = check
                ? languageRepo.getReferenceById(value.name())
                : new LanguageDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        LanguageDto.fromDTO(value, person);
        return LanguageDto.fromEntity(languageRepo.save(person));
    }

    @Override
    public void delete(String id) {
        languageRepo.deleteById(id);
    }
}