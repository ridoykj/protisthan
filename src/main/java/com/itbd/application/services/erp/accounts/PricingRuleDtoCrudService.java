package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.price.PricingRuleDao;
import com.itbd.application.db.dto.price.PricingRuleDto;
import com.itbd.application.db.repos.PricingRuleRepository;
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
public class PricingRuleDtoCrudService implements CrudService<PricingRuleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PricingRuleRepository pricingRuleRepo;

    public PricingRuleDtoCrudService(PricingRuleRepository pricingRuleRepo, JpaFilterConverter jpaFilterConverter) {
        this.pricingRuleRepo = pricingRuleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PricingRuleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PricingRuleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PricingRuleDao.class)
                : Specification.anyOf();
        Page<PricingRuleDao> persons = pricingRuleRepo.findAll(spec, pageable);
        return persons.stream().map(PricingRuleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PricingRuleDto save(PricingRuleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PricingRuleDao person = check
                ? pricingRuleRepo.getReferenceById(value.name())
                : new PricingRuleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PricingRuleDto.fromDTO(value, person);
        return PricingRuleDto.fromEntity(pricingRuleRepo.save(person));
    }

    @Override
    public void delete(String id) {
        pricingRuleRepo.deleteById(id);
    }
}