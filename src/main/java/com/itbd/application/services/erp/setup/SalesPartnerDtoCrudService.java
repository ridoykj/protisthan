package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.setup.SalesPartnerDao;
import com.itbd.application.db.dto.sales.SalesPartnerDto;
import com.itbd.application.db.repos.SalesPartnerRepository;
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
public class SalesPartnerDtoCrudService implements CrudService<SalesPartnerDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesPartnerRepository salesPartnerRepo;

    public SalesPartnerDtoCrudService(SalesPartnerRepository salesPartnerRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesPartnerRepo = salesPartnerRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesPartnerDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesPartnerDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesPartnerDao.class)
                : Specification.anyOf();
        Page<SalesPartnerDao> persons = salesPartnerRepo.findAll(spec, pageable);
        return persons.stream().map(SalesPartnerDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesPartnerDto save(SalesPartnerDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesPartnerDao person = check
                ? salesPartnerRepo.getReferenceById(value.name())
                : new SalesPartnerDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesPartnerDto.fromDTO(value, person);
        return SalesPartnerDto.fromEntity(salesPartnerRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesPartnerRepo.deleteById(id);
    }
}