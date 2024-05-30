package com.itbd.application.services.erp.crm;

import com.itbd.application.db.dao.crm.opportunity.OpportunityTypeDao;
import com.itbd.application.db.dto.opportunity.OpportunityTypeDto;
import com.itbd.application.db.repos.OpportunityTypeRepository;
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
public class OpportunityTypeDtoCrudService implements CrudService<OpportunityTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final OpportunityTypeRepository opportunityTypeRepo;

    public OpportunityTypeDtoCrudService(OpportunityTypeRepository opportunityTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.opportunityTypeRepo = opportunityTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull OpportunityTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<OpportunityTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, OpportunityTypeDao.class)
                : Specification.anyOf();
        Page<OpportunityTypeDao> persons = opportunityTypeRepo.findAll(spec, pageable);
        return persons.stream().map(OpportunityTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable OpportunityTypeDto save(OpportunityTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        OpportunityTypeDao person = check
                ? opportunityTypeRepo.getReferenceById(value.name())
                : new OpportunityTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        OpportunityTypeDto.fromDTO(value, person);
        return OpportunityTypeDto.fromEntity(opportunityTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        opportunityTypeRepo.deleteById(id);
    }
}