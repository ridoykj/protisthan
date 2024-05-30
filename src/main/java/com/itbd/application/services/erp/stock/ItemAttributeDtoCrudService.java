package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.stock.item.ItemAttributeDao;
import com.itbd.application.db.dto.items.ItemAttributeDto;
import com.itbd.application.db.repos.ItemAttributeRepository;
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
public class ItemAttributeDtoCrudService implements CrudService<ItemAttributeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ItemAttributeRepository itemAttributeRepo;

    public ItemAttributeDtoCrudService(ItemAttributeRepository itemAttributeRepo, JpaFilterConverter jpaFilterConverter) {
        this.itemAttributeRepo = itemAttributeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ItemAttributeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ItemAttributeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ItemAttributeDao.class)
                : Specification.anyOf();
        Page<ItemAttributeDao> persons = itemAttributeRepo.findAll(spec, pageable);
        return persons.stream().map(ItemAttributeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ItemAttributeDto save(ItemAttributeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ItemAttributeDao person = check
                ? itemAttributeRepo.getReferenceById(value.name())
                : new ItemAttributeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ItemAttributeDto.fromDTO(value, person);
        return ItemAttributeDto.fromEntity(itemAttributeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        itemAttributeRepo.deleteById(id);
    }
}