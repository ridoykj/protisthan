package com.itbd.application.services.erp.selling.item;

import com.itbd.application.db.dao.price.PriceListDao;
import com.itbd.application.db.dto.price.PriceListDto;
import com.itbd.application.db.repos.PriceListRepository;
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
public class PriceListDtoCrudService implements CrudService<PriceListDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PriceListRepository priceListRepo;

    public PriceListDtoCrudService(PriceListRepository itemPriceRepo, JpaFilterConverter jpaFilterConverter) {
        this.priceListRepo = itemPriceRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PriceListDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PriceListDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PriceListDao.class)
                : Specification.anyOf();
        Page<PriceListDao> persons = priceListRepo.findAll(spec, pageable);
        return persons.stream().map(PriceListDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PriceListDto save(PriceListDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PriceListDao person = check
                ? priceListRepo.getReferenceById(value.name())
                : new PriceListDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PriceListDto.fromDTO(value, person);
        return PriceListDto.fromEntity(priceListRepo.save(person));
    }

    @Override
    public void delete(String id) {
        priceListRepo.deleteById(id);
    }
}