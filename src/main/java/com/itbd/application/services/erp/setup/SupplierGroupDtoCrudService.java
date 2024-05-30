package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.setup.SupplierGroupDao;
import com.itbd.application.db.dto.supplier.SupplierGroupDto;
import com.itbd.application.db.repos.SupplierGroupRepository;
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
public class SupplierGroupDtoCrudService implements CrudService<SupplierGroupDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SupplierGroupRepository supplierGroupRepo;

    public SupplierGroupDtoCrudService(SupplierGroupRepository supplierGroupRepo, JpaFilterConverter jpaFilterConverter) {
        this.supplierGroupRepo = supplierGroupRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SupplierGroupDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SupplierGroupDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SupplierGroupDao.class)
                : Specification.anyOf();
        Page<SupplierGroupDao> persons = supplierGroupRepo.findAll(spec, pageable);
        return persons.stream().map(SupplierGroupDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SupplierGroupDto save(SupplierGroupDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SupplierGroupDao person = check
                ? supplierGroupRepo.getReferenceById(value.name())
                : new SupplierGroupDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SupplierGroupDto.fromDTO(value, person);
        return SupplierGroupDto.fromEntity(supplierGroupRepo.save(person));
    }

    @Override
    public void delete(String id) {
        supplierGroupRepo.deleteById(id);
    }
}