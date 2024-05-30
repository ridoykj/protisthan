package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.setup.UomConversionFactorDao;
import com.itbd.application.db.dto.uoms.UomConversionFactorDto;
import com.itbd.application.db.repos.UomConversionFactorRepository;
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
public class UOMConversionFactorDtoCrudService implements CrudService<UomConversionFactorDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final UomConversionFactorRepository uomConversionFactorRepo;

    public UOMConversionFactorDtoCrudService(UomConversionFactorRepository uomConversionFactorRepo, JpaFilterConverter jpaFilterConverter) {
        this.uomConversionFactorRepo = uomConversionFactorRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull UomConversionFactorDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<UomConversionFactorDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, UomConversionFactorDao.class)
                : Specification.anyOf();
        Page<UomConversionFactorDao> persons = uomConversionFactorRepo.findAll(spec, pageable);
        return persons.stream().map(UomConversionFactorDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable UomConversionFactorDto save(UomConversionFactorDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        UomConversionFactorDao person = check
                ? uomConversionFactorRepo.getReferenceById(value.name())
                : new UomConversionFactorDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        UomConversionFactorDto.fromDTO(value, person);
        return UomConversionFactorDto.fromEntity(uomConversionFactorRepo.save(person));
    }

    @Override
    public void delete(String id) {
        uomConversionFactorRepo.deleteById(id);
    }
}