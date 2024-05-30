package com.itbd.application.services.erp.selling;

import com.itbd.application.db.dao.selling.sales.SalesPartnerTypeDao;
import com.itbd.application.db.dto.sales.SalesPartnerTypeDto;
import com.itbd.application.db.repos.SalesPartnerTypeRepository;
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
public class SalesPartnerTypeDtoCrudService implements CrudService<SalesPartnerTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesPartnerTypeRepository salesPartnerTypeRepo;

    public SalesPartnerTypeDtoCrudService(SalesPartnerTypeRepository salesPartnerTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesPartnerTypeRepo = salesPartnerTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesPartnerTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesPartnerTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesPartnerTypeDao.class)
                : Specification.anyOf();
        Page<SalesPartnerTypeDao> persons = salesPartnerTypeRepo.findAll(spec, pageable);
        return persons.stream().map(SalesPartnerTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesPartnerTypeDto save(SalesPartnerTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesPartnerTypeDao person = check
                ? salesPartnerTypeRepo.getReferenceById(value.name())
                : new SalesPartnerTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesPartnerTypeDto.fromDTO(value, person);
        return SalesPartnerTypeDto.fromEntity(salesPartnerTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesPartnerTypeRepo.deleteById(id);
    }
}