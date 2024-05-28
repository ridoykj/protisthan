package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.stocks.StockEntryTypeDao;
import com.itbd.application.db.dto.stocks.StockEntryTypeDto;
import com.itbd.application.db.repos.StockEntryTypeRepository;
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
public class StockEntryTypeDtoCrudService implements CrudService<StockEntryTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final StockEntryTypeRepository stockEntryTypeRepo;

    public StockEntryTypeDtoCrudService(StockEntryTypeRepository stockEntryTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.stockEntryTypeRepo = stockEntryTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull StockEntryTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<StockEntryTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, StockEntryTypeDao.class)
                : Specification.anyOf();
        Page<StockEntryTypeDao> persons = stockEntryTypeRepo.findAll(spec, pageable);
        return persons.stream().map(StockEntryTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable StockEntryTypeDto save(StockEntryTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        StockEntryTypeDao person = check
                ? stockEntryTypeRepo.getReferenceById(value.name())
                : new StockEntryTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        StockEntryTypeDto.fromDTO(value, person);
        return StockEntryTypeDto.fromEntity(stockEntryTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        stockEntryTypeRepo.deleteById(id);
    }
}