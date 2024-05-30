package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.stock.UomCategoryDao;
import com.itbd.application.db.dto.uoms.UomCategoryDto;
import com.itbd.application.db.repos.UomCategoryRepository;
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
public class UomCategoryDtoCrudService implements CrudService<UomCategoryDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final UomCategoryRepository uomCategoryRepo;

    public UomCategoryDtoCrudService(UomCategoryRepository uomCategoryRepo, JpaFilterConverter jpaFilterConverter) {
        this.uomCategoryRepo = uomCategoryRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull UomCategoryDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<UomCategoryDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, UomCategoryDao.class)
                : Specification.anyOf();
        Page<UomCategoryDao> persons = uomCategoryRepo.findAll(spec, pageable);
        return persons.stream().map(UomCategoryDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable UomCategoryDto save(UomCategoryDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        UomCategoryDao person = check
                ? uomCategoryRepo.getReferenceById(value.name())
                : new UomCategoryDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        UomCategoryDto.fromDTO(value, person);
        return UomCategoryDto.fromEntity(uomCategoryRepo.save(person));
    }

    @Override
    public void delete(String id) {
        uomCategoryRepo.deleteById(id);
    }
}