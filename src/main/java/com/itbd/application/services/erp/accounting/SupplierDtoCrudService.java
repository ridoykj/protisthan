package com.itbd.application.services.erp.crm;

import com.itbd.application.db.dao.supplier.SupplierDao;
import com.itbd.application.db.dto.supplier.SupplierDto;
import com.itbd.application.db.repos.SupplierRepository;
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
public class SupplierDtoCrudService implements CrudService<SupplierDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SupplierRepository supplierRepo;

    public SupplierDtoCrudService(SupplierRepository supplierRepo, JpaFilterConverter jpaFilterConverter) {
        this.supplierRepo = supplierRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SupplierDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SupplierDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SupplierDao.class)
                : Specification.anyOf();
        Page<SupplierDao> persons = supplierRepo.findAll(spec, pageable);
        return persons.stream().map(SupplierDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SupplierDto save(SupplierDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SupplierDao person = check
                ? supplierRepo.getReferenceById(value.name())
                : new SupplierDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SupplierDto.fromDTO(value, person);
        return SupplierDto.fromEntity(supplierRepo.save(person));
    }

    @Override
    public void delete(String id) {
        supplierRepo.deleteById(id);
    }
}