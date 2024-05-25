package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.uoms.UomDao;
import com.itbd.application.db.dto.uoms.UomDto;
import com.itbd.application.db.repos.UomRepository;
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
public class UomDtoCrudService implements CrudService<UomDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final UomRepository uomRepo;

    public UomDtoCrudService(UomRepository uomRepo, JpaFilterConverter jpaFilterConverter) {
        this.uomRepo = uomRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull UomDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<UomDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, UomDao.class)
                : Specification.anyOf();
        Page<UomDao> persons = uomRepo.findAll(spec, pageable);
        return persons.stream().map(UomDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable UomDto save(UomDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        UomDao person = check
                ? uomRepo.getReferenceById(value.name())
                : new UomDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        UomDto.fromDTO(value, person);
        return UomDto.fromEntity(uomRepo.save(person));
    }

    @Override
    public void delete(String id) {
        uomRepo.deleteById(id);
    }
}