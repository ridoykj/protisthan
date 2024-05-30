package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.accounts.ItemTaxTemplateDao;
import com.itbd.application.db.dto.items.ItemTaxTemplateDto;
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
public class ItemTaxTemplateDtoCrudService implements CrudService<ItemTaxTemplateDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ItemTaxTemplateRepository itemTaxTemplateRepo;

    public ItemTaxTemplateDtoCrudService(ItemTaxTemplateRepository itemTaxTemplateRepo, JpaFilterConverter jpaFilterConverter) {
        this.itemTaxTemplateRepo = itemTaxTemplateRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ItemTaxTemplateDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ItemTaxTemplateDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ItemTaxTemplateDao.class)
                : Specification.anyOf();
        Page<ItemTaxTemplateDao> persons = itemTaxTemplateRepo.findAll(spec, pageable);
        return persons.stream().map(ItemTaxTemplateDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ItemTaxTemplateDto save(ItemTaxTemplateDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ItemTaxTemplateDao person = check
                ? itemTaxTemplateRepo.getReferenceById(value.name())
                : new ItemTaxTemplateDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ItemTaxTemplateDto.fromDTO(value, person);
        return ItemTaxTemplateDto.fromEntity(itemTaxTemplateRepo.save(person));
    }

    @Override
    public void delete(String id) {
        itemTaxTemplateRepo.deleteById(id);
    }
}