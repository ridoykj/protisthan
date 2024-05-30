package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.CurrencyExchangeSettingsDetailsDao;
import com.itbd.application.db.dto.currencys.CurrencyExchangeSettingsDetailsDto;
import com.itbd.application.db.repos.CurrencyExchangeSettingsDetailsRepository;
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
public class CurrencyExchangeSettingsDetailsDtoCrudService implements CrudService<CurrencyExchangeSettingsDetailsDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CurrencyExchangeSettingsDetailsRepository currencyExchangeSettingsDetailsRepo;

    public CurrencyExchangeSettingsDetailsDtoCrudService(CurrencyExchangeSettingsDetailsRepository currencyExchangeSettingsDetailsRepo, JpaFilterConverter jpaFilterConverter) {
        this.currencyExchangeSettingsDetailsRepo = currencyExchangeSettingsDetailsRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CurrencyExchangeSettingsDetailsDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CurrencyExchangeSettingsDetailsDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CurrencyExchangeSettingsDetailsDao.class)
                : Specification.anyOf();
        Page<CurrencyExchangeSettingsDetailsDao> persons = currencyExchangeSettingsDetailsRepo.findAll(spec, pageable);
        return persons.stream().map(CurrencyExchangeSettingsDetailsDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CurrencyExchangeSettingsDetailsDto save(CurrencyExchangeSettingsDetailsDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CurrencyExchangeSettingsDetailsDao person = check
                ? currencyExchangeSettingsDetailsRepo.getReferenceById(value.name())
                : new CurrencyExchangeSettingsDetailsDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CurrencyExchangeSettingsDetailsDto.fromDTO(value, person);
        return CurrencyExchangeSettingsDetailsDto.fromEntity(currencyExchangeSettingsDetailsRepo.save(person));
    }

    @Override
    public void delete(String id) {
        currencyExchangeSettingsDetailsRepo.deleteById(id);
    }
}