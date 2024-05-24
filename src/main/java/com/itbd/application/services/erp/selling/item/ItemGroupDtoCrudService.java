package com.itbd.application.services.erp.selling.item;

import com.itbd.application.db.dao.items.ItemGroupDao;
import com.itbd.application.db.dto.items.ItemGroupDto;
import com.itbd.application.db.repos.ItemGroupRepository;
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
public class ItemGroupDtoCrudService implements CrudService<ItemGroupDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ItemGroupRepository itemGroupRepo;

    public ItemGroupDtoCrudService(ItemGroupRepository itemGroupRepo, JpaFilterConverter jpaFilterConverter) {
        this.itemGroupRepo = itemGroupRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ItemGroupDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ItemGroupDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ItemGroupDao.class)
                : Specification.anyOf();
        Page<ItemGroupDao> persons = itemGroupRepo.findAll(spec, pageable);
        return persons.stream().map(ItemGroupDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ItemGroupDto save(ItemGroupDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ItemGroupDao person = check
                ? itemGroupRepo.getReferenceById(value.name())
                : new ItemGroupDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ItemGroupDto.fromDTO(value, person);
        return ItemGroupDto.fromEntity(itemGroupRepo.save(person));
    }

    @Override
    public void delete(String id) {
        itemGroupRepo.deleteById(id);
    }
}