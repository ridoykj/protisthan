package com.itbd.application.services.erp.selling.settings;

import com.itbd.application.db.dao.LeadSourceDao;
import com.itbd.application.db.dto.LeadSourceDto;
import com.itbd.application.db.repos.LeadSourceRepository;
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
public class LeadSourceDtoCrudService implements CrudService<LeadSourceDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final LeadSourceRepository leadSourceRepository;

    public LeadSourceDtoCrudService(LeadSourceRepository leadSourceRepository, JpaFilterConverter jpaFilterConverter) {
        this.leadSourceRepository = leadSourceRepository;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull LeadSourceDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<LeadSourceDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, LeadSourceDao.class)
                : Specification.anyOf();
        Page<LeadSourceDao> persons = leadSourceRepository.findAll(spec, pageable);
        return persons.stream().map(LeadSourceDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable LeadSourceDto save(LeadSourceDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        LeadSourceDao person = check
                ? leadSourceRepository.getReferenceById(value.name())
                : new LeadSourceDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        LeadSourceDto.fromDTO(value, person);
        return LeadSourceDto.fromEntity(leadSourceRepository.save(person));
    }

    @Override
    public void delete(String id) {
        leadSourceRepository.deleteById(id);
    }
}