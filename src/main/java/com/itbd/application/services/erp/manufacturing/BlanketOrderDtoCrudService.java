package com.itbd.application.services.erp.manufacturing;

import com.itbd.application.db.dao.BlanketOrderDao;
import com.itbd.application.db.dto.BlanketOrderDto;
import com.itbd.application.db.repos.BlanketOrderRepository;
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
public class BlanketOrderDtoCrudService implements CrudService<BlanketOrderDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final BlanketOrderRepository blanketOrderRepo;

    public BlanketOrderDtoCrudService(BlanketOrderRepository blanketOrderRepo, JpaFilterConverter jpaFilterConverter) {
        this.blanketOrderRepo = blanketOrderRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull BlanketOrderDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<BlanketOrderDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, BlanketOrderDao.class)
                : Specification.anyOf();
        Page<BlanketOrderDao> persons = blanketOrderRepo.findAll(spec, pageable);
        return persons.stream().map(BlanketOrderDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable BlanketOrderDto save(BlanketOrderDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        BlanketOrderDao person = check
                ? blanketOrderRepo.getReferenceById(value.name())
                : new BlanketOrderDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        BlanketOrderDto.fromDTO(value, person);
        return BlanketOrderDto.fromEntity(blanketOrderRepo.save(person));
    }

    @Override
    public void delete(String id) {
        blanketOrderRepo.deleteById(id);
    }
}