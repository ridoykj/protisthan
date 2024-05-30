package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.setup.BrandDao;
import com.itbd.application.db.dto.BrandDto;
import com.itbd.application.db.repos.BrandRepository;
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
public class BrandDtoCrudService implements CrudService<BrandDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final BrandRepository brandRepo;

    public BrandDtoCrudService(BrandRepository brandRepo, JpaFilterConverter jpaFilterConverter) {
        this.brandRepo = brandRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull BrandDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<BrandDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, BrandDao.class)
                : Specification.anyOf();
        Page<BrandDao> persons = brandRepo.findAll(spec, pageable);
        return persons.stream().map(BrandDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable BrandDto save(BrandDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        BrandDao person = check
                ? brandRepo.getReferenceById(value.name())
                : new BrandDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        BrandDto.fromDTO(value, person);
        return BrandDto.fromEntity(brandRepo.save(person));
    }

    @Override
    public void delete(String id) {
        brandRepo.deleteById(id);
    }
}