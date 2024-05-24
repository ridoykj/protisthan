package com.itbd.application.services.erp.selling.item;

import com.itbd.application.db.dao.shipments.ShippingRuleDao;
import com.itbd.application.db.dto.shipments.ShippingRuleDto;
import com.itbd.application.db.repos.ShippingRuleRepository;
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
public class ShippingRuleDtoCrudService implements CrudService<ShippingRuleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ShippingRuleRepository shippingRuleRepo;

    public ShippingRuleDtoCrudService(ShippingRuleRepository shippingRuleRepo, JpaFilterConverter jpaFilterConverter) {
        this.shippingRuleRepo = shippingRuleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ShippingRuleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ShippingRuleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ShippingRuleDao.class)
                : Specification.anyOf();
        Page<ShippingRuleDao> persons = shippingRuleRepo.findAll(spec, pageable);
        return persons.stream().map(ShippingRuleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ShippingRuleDto save(ShippingRuleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ShippingRuleDao person = check
                ? shippingRuleRepo.getReferenceById(value.name())
                : new ShippingRuleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ShippingRuleDto.fromDTO(value, person);
        return ShippingRuleDto.fromEntity(shippingRuleRepo.save(person));
    }

    @Override
    public void delete(String id) {
        shippingRuleRepo.deleteById(id);
    }
}