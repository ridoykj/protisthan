package com.itbd.application.services.erp.geo;

import com.itbd.application.db.dao.currencys.CurrencyDao;
import com.itbd.application.db.dto.currencys.CurrencyDto;
import com.itbd.application.db.repos.CurrencyRepository;
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
public class CurrencyDtoCrudService implements CrudService<CurrencyDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CurrencyRepository currencyRepo;

    public CurrencyDtoCrudService(CurrencyRepository currencyRepo, JpaFilterConverter jpaFilterConverter) {
        this.currencyRepo = currencyRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CurrencyDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CurrencyDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CurrencyDao.class)
                : Specification.anyOf();
        Page<CurrencyDao> persons = currencyRepo.findAll(spec, pageable);
        return persons.stream().map(CurrencyDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CurrencyDto save(CurrencyDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CurrencyDao person = check
                ? currencyRepo.getReferenceById(value.name())
                : new CurrencyDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CurrencyDto.fromDTO(value, person);
        return CurrencyDto.fromEntity(currencyRepo.save(person));
    }

    @Override
    public void delete(String id) {
        currencyRepo.deleteById(id);
    }
}