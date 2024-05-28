package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.items.ItemTaxTemplateDetailDao;
import com.itbd.application.db.dto.items.ItemTaxTemplateDetailDto;
import com.itbd.application.db.repos.ItemTaxTemplateDetailRepository;
import com.itbd.application.db.repos.ItemTaxTemplateRepository;
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
public class ItemTaxTemplateDetailDtoCrudService implements CrudService<ItemTaxTemplateDetailDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ItemTaxTemplateDetailRepository itemTaxTemplateDetailRepo;

    public ItemTaxTemplateDetailDtoCrudService(ItemTaxTemplateDetailRepository itemTaxTemplateDetailRepo, JpaFilterConverter jpaFilterConverter) {
        this.itemTaxTemplateDetailRepo = itemTaxTemplateDetailRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ItemTaxTemplateDetailDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ItemTaxTemplateDetailDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ItemTaxTemplateDetailDao.class)
                : Specification.anyOf();
        Page<ItemTaxTemplateDetailDao> persons = itemTaxTemplateDetailRepo.findAll(spec, pageable);
        return persons.stream().map(ItemTaxTemplateDetailDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ItemTaxTemplateDetailDto save(ItemTaxTemplateDetailDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ItemTaxTemplateDetailDao person = check
                ? itemTaxTemplateDetailRepo.getReferenceById(value.name())
                : new ItemTaxTemplateDetailDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ItemTaxTemplateDetailDto.fromDTO(value, person);
        return ItemTaxTemplateDetailDto.fromEntity(itemTaxTemplateDetailRepo.save(person));
    }

    @Override
    public void delete(String id) {
        itemTaxTemplateDetailRepo.deleteById(id);
    }
}