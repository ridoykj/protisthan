package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.stock.warehouse.WarehouseDao;
import com.itbd.application.db.dto.warehouse.WarehouseDto;
import com.itbd.application.db.repos.WarehouseRepository;
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
public class WarehouseDtoCrudService implements CrudService<WarehouseDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WarehouseRepository warehouseRepo;

    public WarehouseDtoCrudService(WarehouseRepository warehouseRepo, JpaFilterConverter jpaFilterConverter) {
        this.warehouseRepo = warehouseRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WarehouseDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WarehouseDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WarehouseDao.class)
                : Specification.anyOf();
        Page<WarehouseDao> persons = warehouseRepo.findAll(spec, pageable);
        return persons.stream().map(WarehouseDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WarehouseDto save(WarehouseDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WarehouseDao person = check
                ? warehouseRepo.getReferenceById(value.name())
                : new WarehouseDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WarehouseDto.fromDTO(value, person);
        return WarehouseDto.fromEntity(warehouseRepo.save(person));
    }

    @Override
    public void delete(String id) {
        warehouseRepo.deleteById(id);
    }
}