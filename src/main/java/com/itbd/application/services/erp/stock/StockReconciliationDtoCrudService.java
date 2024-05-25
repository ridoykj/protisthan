package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.stocks.StockReconciliationDao;
import com.itbd.application.db.dto.stocks.StockReconciliationDto;
import com.itbd.application.db.repos.StockReconciliationRepository;
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
public class StockReconciliationDtoCrudService implements CrudService<StockReconciliationDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final StockReconciliationRepository stockReconciliationRepo;

    public StockReconciliationDtoCrudService(StockReconciliationRepository stockReconciliationRepo, JpaFilterConverter jpaFilterConverter) {
        this.stockReconciliationRepo = stockReconciliationRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull StockReconciliationDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<StockReconciliationDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, StockReconciliationDao.class)
                : Specification.anyOf();
        Page<StockReconciliationDao> persons = stockReconciliationRepo.findAll(spec, pageable);
        return persons.stream().map(StockReconciliationDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable StockReconciliationDto save(StockReconciliationDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        StockReconciliationDao person = check
                ? stockReconciliationRepo.getReferenceById(value.name())
                : new StockReconciliationDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        StockReconciliationDto.fromDTO(value, person);
        return StockReconciliationDto.fromEntity(stockReconciliationRepo.save(person));
    }

    @Override
    public void delete(String id) {
        stockReconciliationRepo.deleteById(id);
    }
}