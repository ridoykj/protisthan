package com.itbd.application.services.erp.selling.settings;

import com.itbd.application.db.dao.TermsAndConditionsDao;
import com.itbd.application.db.dto.TermsAndConditionsDto;
import com.itbd.application.db.repos.TermsAndConditionsRepository;
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
public class TermsAndConditionsDtoCrudService implements CrudService<TermsAndConditionsDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final TermsAndConditionsRepository termsAndConditionsRepo;

    public TermsAndConditionsDtoCrudService(TermsAndConditionsRepository termsAndConditionsRepo, JpaFilterConverter jpaFilterConverter) {
        this.termsAndConditionsRepo = termsAndConditionsRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull TermsAndConditionsDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<TermsAndConditionsDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, TermsAndConditionsDao.class)
                : Specification.anyOf();
        Page<TermsAndConditionsDao> persons = termsAndConditionsRepo.findAll(spec, pageable);
        return persons.stream().map(TermsAndConditionsDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable TermsAndConditionsDto save(TermsAndConditionsDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        TermsAndConditionsDao person = check
                ? termsAndConditionsRepo.getReferenceById(value.name())
                : new TermsAndConditionsDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        TermsAndConditionsDto.fromDTO(value, person);
        return TermsAndConditionsDto.fromEntity(termsAndConditionsRepo.save(person));
    }

    @Override
    public void delete(String id) {
        termsAndConditionsRepo.deleteById(id);
    }
}