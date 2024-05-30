package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.stock.VariantFieldDao;
import com.itbd.application.db.dto.VariantFieldDto;
import com.itbd.application.db.repos.VariantFieldRepository;
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
public class VariantFieldDtoCrudService implements CrudService<VariantFieldDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final VariantFieldRepository variantFieldRepo;

    public VariantFieldDtoCrudService(VariantFieldRepository variantFieldRepo, JpaFilterConverter jpaFilterConverter) {
        this.variantFieldRepo = variantFieldRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull VariantFieldDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<VariantFieldDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, VariantFieldDao.class)
                : Specification.anyOf();
        Page<VariantFieldDao> persons = variantFieldRepo.findAll(spec, pageable);
        return persons.stream().map(VariantFieldDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable VariantFieldDto save(VariantFieldDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        VariantFieldDao person = check
                ? variantFieldRepo.getReferenceById(value.name())
                : new VariantFieldDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        VariantFieldDto.fromDTO(value, person);
        return VariantFieldDto.fromEntity(variantFieldRepo.save(person));
    }

    @Override
    public void delete(String id) {
        variantFieldRepo.deleteById(id);
    }
}