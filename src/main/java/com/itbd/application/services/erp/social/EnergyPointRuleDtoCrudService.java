package com.itbd.application.services.erp.social;

import com.itbd.application.db.dao.social.EnergyPointRuleDao;
import com.itbd.application.db.dto.EnergyPointRuleDto;
import com.itbd.application.db.repos.EnergyPointRuleRepository;
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
public class EnergyPointRuleDtoCrudService implements CrudService<EnergyPointRuleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final EnergyPointRuleRepository energyPointRuleRepo;

    public EnergyPointRuleDtoCrudService(EnergyPointRuleRepository energyPointRuleRepo, JpaFilterConverter jpaFilterConverter) {
        this.energyPointRuleRepo = energyPointRuleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull EnergyPointRuleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<EnergyPointRuleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, EnergyPointRuleDao.class)
                : Specification.anyOf();
        Page<EnergyPointRuleDao> persons = energyPointRuleRepo.findAll(spec, pageable);
        return persons.stream().map(EnergyPointRuleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable EnergyPointRuleDto save(EnergyPointRuleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        EnergyPointRuleDao person = check
                ? energyPointRuleRepo.getReferenceById(value.name())
                : new EnergyPointRuleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        EnergyPointRuleDto.fromDTO(value, person);
        return EnergyPointRuleDto.fromEntity(energyPointRuleRepo.save(person));
    }

    @Override
    public void delete(String id) {
        energyPointRuleRepo.deleteById(id);
    }
}