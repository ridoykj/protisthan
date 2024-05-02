package com.itbd.application.services.erp.sale.item;

import com.itbd.application.db.dao.items.ItemDao;
import com.itbd.application.db.dto.items.ItemDto;
import com.itbd.application.db.repos.ItemRepository;
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
public class ItemDtoCrudService implements CrudService<ItemDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ItemRepository itemRepo;

    public ItemDtoCrudService(ItemRepository itemRepo, JpaFilterConverter jpaFilterConverter) {
        this.itemRepo = itemRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ItemDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ItemDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ItemDao.class)
                : Specification.anyOf();
        Page<ItemDao> persons = itemRepo.findAll(spec, pageable);
        return persons.stream().map(ItemDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ItemDto save(ItemDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ItemDao person = check
                ? itemRepo.getReferenceById(value.name())
                : new ItemDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ItemDto.fromDTO(value, person);
        return ItemDto.fromEntity(itemRepo.save(person));
    }

    @Override
    public void delete(String id) {
        itemRepo.deleteById(id);
    }
}