package com.itbd.application.services.erp.crm;

import com.itbd.application.db.dao.MarketSegmentDao;
import com.itbd.application.db.dto.MarketSegmentDto;
import com.itbd.application.db.repos.MarketSegmentRepository;
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
public class MarketSegmentDtoCrudService implements CrudService<MarketSegmentDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final MarketSegmentRepository marketSegmentRepo;

    public MarketSegmentDtoCrudService(MarketSegmentRepository marketSegmentRepo, JpaFilterConverter jpaFilterConverter) {
        this.marketSegmentRepo = marketSegmentRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull MarketSegmentDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<MarketSegmentDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, MarketSegmentDao.class)
                : Specification.anyOf();
        Page<MarketSegmentDao> persons = marketSegmentRepo.findAll(spec, pageable);
        return persons.stream().map(MarketSegmentDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable MarketSegmentDto save(MarketSegmentDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        MarketSegmentDao person = check
                ? marketSegmentRepo.getReferenceById(value.name())
                : new MarketSegmentDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        MarketSegmentDto.fromDTO(value, person);
        return MarketSegmentDto.fromEntity(marketSegmentRepo.save(person));
    }

    @Override
    public void delete(String id) {
        marketSegmentRepo.deleteById(id);
    }
}