package com.itbd.application.services.erp.selling.item;

import com.itbd.application.db.dao.ProductBundleDao;
import com.itbd.application.db.dto.ProductBundleDto;
import com.itbd.application.db.repos.ProductBundleRepository;
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
public class ProductBundleDtoCrudService implements CrudService<ProductBundleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ProductBundleRepository productBundleRepo;

    public ProductBundleDtoCrudService(ProductBundleRepository productBundleRepo, JpaFilterConverter jpaFilterConverter) {
        this.productBundleRepo = productBundleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ProductBundleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ProductBundleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ProductBundleDao.class)
                : Specification.anyOf();
        Page<ProductBundleDao> persons = productBundleRepo.findAll(spec, pageable);
        return persons.stream().map(ProductBundleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ProductBundleDto save(ProductBundleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ProductBundleDao person = check
                ? productBundleRepo.getReferenceById(value.name())
                : new ProductBundleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ProductBundleDto.fromDTO(value, person);
        return ProductBundleDto.fromEntity(productBundleRepo.save(person));
    }

    @Override
    public void delete(String id) {
        productBundleRepo.deleteById(id);
    }
}