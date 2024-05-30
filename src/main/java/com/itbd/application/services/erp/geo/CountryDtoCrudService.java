package com.itbd.application.services.erp.geo;

import com.itbd.application.db.dao.geo.CountryDao;
import com.itbd.application.db.dto.CountryDto;
import com.itbd.application.db.repos.CountryRepository;
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
public class CountryDtoCrudService implements CrudService<CountryDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CountryRepository countryRepo;

    public CountryDtoCrudService(CountryRepository countryRepo, JpaFilterConverter jpaFilterConverter) {
        this.countryRepo = countryRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CountryDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CountryDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CountryDao.class)
                : Specification.anyOf();
        Page<CountryDao> persons = countryRepo.findAll(spec, pageable);
        return persons.stream().map(CountryDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CountryDto save(CountryDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CountryDao person = check
                ? countryRepo.getReferenceById(value.name())
                : new CountryDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CountryDto.fromDTO(value, person);
        return CountryDto.fromEntity(countryRepo.save(person));
    }

    @Override
    public void delete(String id) {
        countryRepo.deleteById(id);
    }
}