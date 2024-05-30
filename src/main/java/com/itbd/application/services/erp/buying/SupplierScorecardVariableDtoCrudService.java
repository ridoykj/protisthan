package com.itbd.application.services.erp.buying;

import com.itbd.application.db.dao.buying.supplier.SupplierScorecardVariableDao;
import com.itbd.application.db.dto.supplier.SupplierScorecardVariableDto;
import com.itbd.application.db.repos.SupplierScorecardVariableRepository;
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
public class SupplierScorecardVariableDtoCrudService implements CrudService<SupplierScorecardVariableDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SupplierScorecardVariableRepository supplierScorecardVariableRepo;

    public SupplierScorecardVariableDtoCrudService(SupplierScorecardVariableRepository supplierScorecardVariableRepo, JpaFilterConverter jpaFilterConverter) {
        this.supplierScorecardVariableRepo = supplierScorecardVariableRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SupplierScorecardVariableDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SupplierScorecardVariableDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SupplierScorecardVariableDao.class)
                : Specification.anyOf();
        Page<SupplierScorecardVariableDao> persons = supplierScorecardVariableRepo.findAll(spec, pageable);
        return persons.stream().map(SupplierScorecardVariableDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SupplierScorecardVariableDto save(SupplierScorecardVariableDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SupplierScorecardVariableDao person = check
                ? supplierScorecardVariableRepo.getReferenceById(value.name())
                : new SupplierScorecardVariableDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SupplierScorecardVariableDto.fromDTO(value, person);
        return SupplierScorecardVariableDto.fromEntity(supplierScorecardVariableRepo.save(person));
    }

    @Override
    public void delete(String id) {
        supplierScorecardVariableRepo.deleteById(id);
    }
}