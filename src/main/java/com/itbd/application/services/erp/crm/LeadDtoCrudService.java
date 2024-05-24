package com.itbd.application.services.erp.crm;

import com.itbd.application.db.dao.LeadDao;
import com.itbd.application.db.dto.LeadDto;
import com.itbd.application.db.repos.BrandRepository;
import com.itbd.application.db.repos.LeadRepository;
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
public class LeadDtoCrudService implements CrudService<LeadDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final LeadRepository leadRepo;

    public LeadDtoCrudService(LeadRepository leadRepo, JpaFilterConverter jpaFilterConverter) {
        this.leadRepo = leadRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull LeadDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<LeadDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, LeadDao.class)
                : Specification.anyOf();
        Page<LeadDao> persons = leadRepo.findAll(spec, pageable);
        return persons.stream().map(LeadDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable LeadDto save(LeadDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        LeadDao person = check
                ? leadRepo.getReferenceById(value.name())
                : new LeadDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        LeadDto.fromDTO(value, person);
        return LeadDto.fromEntity(leadRepo.save(person));
    }

    @Override
    public void delete(String id) {
        leadRepo.deleteById(id);
    }
}