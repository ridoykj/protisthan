package com.itbd.application.services.erp.buying;

import com.itbd.application.db.dao.supplier.SupplierScorecardStandingDao;
import com.itbd.application.db.dto.supplier.SupplierScorecardStandingDto;
import com.itbd.application.db.repos.SupplierScorecardStandingRepository;
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
public class SupplierScorecardStandingDtoCrudService implements CrudService<SupplierScorecardStandingDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SupplierScorecardStandingRepository supplierScorecardStandingRepo;

    public SupplierScorecardStandingDtoCrudService(SupplierScorecardStandingRepository supplierScorecardStandingRepo, JpaFilterConverter jpaFilterConverter) {
        this.supplierScorecardStandingRepo = supplierScorecardStandingRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SupplierScorecardStandingDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SupplierScorecardStandingDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SupplierScorecardStandingDao.class)
                : Specification.anyOf();
        Page<SupplierScorecardStandingDao> persons = supplierScorecardStandingRepo.findAll(spec, pageable);
        return persons.stream().map(SupplierScorecardStandingDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SupplierScorecardStandingDto save(SupplierScorecardStandingDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SupplierScorecardStandingDao person = check
                ? supplierScorecardStandingRepo.getReferenceById(value.name())
                : new SupplierScorecardStandingDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SupplierScorecardStandingDto.fromDTO(value, person);
        return SupplierScorecardStandingDto.fromEntity(supplierScorecardStandingRepo.save(person));
    }

    @Override
    public void delete(String id) {
        supplierScorecardStandingRepo.deleteById(id);
    }
}