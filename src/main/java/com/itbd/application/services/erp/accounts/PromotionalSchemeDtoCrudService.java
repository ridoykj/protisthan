package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.PromotionalSchemeDao;
import com.itbd.application.db.dto.PromotionalSchemeDto;
import com.itbd.application.db.repos.PromotionalSchemeRepository;
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
public class PromotionalSchemeDtoCrudService implements CrudService<PromotionalSchemeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PromotionalSchemeRepository promotionalSchemeRepo;

    public PromotionalSchemeDtoCrudService(PromotionalSchemeRepository promotionalSchemeRepo, JpaFilterConverter jpaFilterConverter) {
        this.promotionalSchemeRepo = promotionalSchemeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PromotionalSchemeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PromotionalSchemeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PromotionalSchemeDao.class)
                : Specification.anyOf();
        Page<PromotionalSchemeDao> persons = promotionalSchemeRepo.findAll(spec, pageable);
        return persons.stream().map(PromotionalSchemeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PromotionalSchemeDto save(PromotionalSchemeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PromotionalSchemeDao person = check
                ? promotionalSchemeRepo.getReferenceById(value.name())
                : new PromotionalSchemeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PromotionalSchemeDto.fromDTO(value, person);
        return PromotionalSchemeDto.fromEntity(promotionalSchemeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        promotionalSchemeRepo.deleteById(id);
    }
}