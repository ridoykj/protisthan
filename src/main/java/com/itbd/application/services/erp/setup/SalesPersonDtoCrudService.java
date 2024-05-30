package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.setup.SalesPersonDao;
import com.itbd.application.db.dto.sales.SalesPersonDto;
import com.itbd.application.db.repos.SalesPersonRepository;
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
public class SalesPersonDtoCrudService implements CrudService<SalesPersonDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final SalesPersonRepository salesPersonRepo;

    public SalesPersonDtoCrudService(SalesPersonRepository salesPersonRepo, JpaFilterConverter jpaFilterConverter) {
        this.salesPersonRepo = salesPersonRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull SalesPersonDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<SalesPersonDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, SalesPersonDao.class)
                : Specification.anyOf();
        Page<SalesPersonDao> persons = salesPersonRepo.findAll(spec, pageable);
        return persons.stream().map(SalesPersonDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable SalesPersonDto save(SalesPersonDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        SalesPersonDao person = check
                ? salesPersonRepo.getReferenceById(value.name())
                : new SalesPersonDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        SalesPersonDto.fromDTO(value, person);
        return SalesPersonDto.fromEntity(salesPersonRepo.save(person));
    }

    @Override
    public void delete(String id) {
        salesPersonRepo.deleteById(id);
    }
}