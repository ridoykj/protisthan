package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.items.ItemAttributeValueDao;
import com.itbd.application.db.dto.items.ItemAttributeValueDto;
import com.itbd.application.db.repos.ItemAttributeValueRepository;
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
public class ItemAttributeValueDtoCrudService implements CrudService<ItemAttributeValueDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ItemAttributeValueRepository itemAttributeValueRepo;

    public ItemAttributeValueDtoCrudService(ItemAttributeValueRepository itemAttributeValueRepo, JpaFilterConverter jpaFilterConverter) {
        this.itemAttributeValueRepo = itemAttributeValueRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ItemAttributeValueDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ItemAttributeValueDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ItemAttributeValueDao.class)
                : Specification.anyOf();
        Page<ItemAttributeValueDao> persons = itemAttributeValueRepo.findAll(spec, pageable);
        return persons.stream().map(ItemAttributeValueDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ItemAttributeValueDto save(ItemAttributeValueDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ItemAttributeValueDao person = check
                ? itemAttributeValueRepo.getReferenceById(value.name())
                : new ItemAttributeValueDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ItemAttributeValueDto.fromDTO(value, person);
        return ItemAttributeValueDto.fromEntity(itemAttributeValueRepo.save(person));
    }

    @Override
    public void delete(String id) {
        itemAttributeValueRepo.deleteById(id);
    }
}