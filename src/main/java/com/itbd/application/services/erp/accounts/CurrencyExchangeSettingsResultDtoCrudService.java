package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.currencys.CurrencyExchangeSettingsResultDao;
import com.itbd.application.db.dto.currencys.CurrencyExchangeSettingsResultDto;
import com.itbd.application.db.repos.CurrencyExchangeSettingsDetailsRepository;
import com.itbd.application.db.repos.CurrencyExchangeSettingsResultRepository;
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
public class CurrencyExchangeSettingsResultDtoCrudService implements CrudService<CurrencyExchangeSettingsResultDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CurrencyExchangeSettingsResultRepository currencyExchangeSettingsResultRepo;

    public CurrencyExchangeSettingsResultDtoCrudService(CurrencyExchangeSettingsResultRepository currencyExchangeSettingsResultRepo, JpaFilterConverter jpaFilterConverter) {
        this.currencyExchangeSettingsResultRepo = currencyExchangeSettingsResultRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CurrencyExchangeSettingsResultDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CurrencyExchangeSettingsResultDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CurrencyExchangeSettingsResultDao.class)
                : Specification.anyOf();
        Page<CurrencyExchangeSettingsResultDao> persons = currencyExchangeSettingsResultRepo.findAll(spec, pageable);
        return persons.stream().map(CurrencyExchangeSettingsResultDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CurrencyExchangeSettingsResultDto save(CurrencyExchangeSettingsResultDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CurrencyExchangeSettingsResultDao person = check
                ? currencyExchangeSettingsResultRepo.getReferenceById(value.name())
                : new CurrencyExchangeSettingsResultDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CurrencyExchangeSettingsResultDto.fromDTO(value, person);
        return CurrencyExchangeSettingsResultDto.fromEntity(currencyExchangeSettingsResultRepo.save(person));
    }

    @Override
    public void delete(String id) {
        currencyExchangeSettingsResultRepo.deleteById(id);
    }
}