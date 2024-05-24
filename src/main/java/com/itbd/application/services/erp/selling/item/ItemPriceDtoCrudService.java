package com.itbd.application.services.erp.selling.item;

import com.itbd.application.db.dao.items.ItemPriceDao;
import com.itbd.application.db.dto.items.ItemPriceDto;
import com.itbd.application.db.repos.ItemPriceRepository;
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
public class ItemPriceDtoCrudService implements CrudService<ItemPriceDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ItemPriceRepository itemPriceRepo;

    public ItemPriceDtoCrudService(ItemPriceRepository itemPriceRepo, JpaFilterConverter jpaFilterConverter) {
        this.itemPriceRepo = itemPriceRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ItemPriceDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ItemPriceDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ItemPriceDao.class)
                : Specification.anyOf();
        Page<ItemPriceDao> persons = itemPriceRepo.findAll(spec, pageable);
        return persons.stream().map(ItemPriceDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ItemPriceDto save(ItemPriceDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ItemPriceDao person = check
                ? itemPriceRepo.getReferenceById(value.name())
                : new ItemPriceDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ItemPriceDto.fromDTO(value, person);
        return ItemPriceDto.fromEntity(itemPriceRepo.save(person));
    }

    @Override
    public void delete(String id) {
        itemPriceRepo.deleteById(id);
    }
}