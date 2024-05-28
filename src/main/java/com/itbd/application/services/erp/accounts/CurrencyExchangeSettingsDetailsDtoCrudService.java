package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.CostCenterDao;
import com.itbd.application.db.dto.CostCenterDto;
import com.itbd.application.db.repos.CostCenterRepository;
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
public class CostCenterDtoCrudService implements CrudService<CostCenterDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CostCenterRepository costCenterRepo;

    public CostCenterDtoCrudService(CostCenterRepository costCenterRepo, JpaFilterConverter jpaFilterConverter) {
        this.costCenterRepo = costCenterRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CostCenterDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CostCenterDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CostCenterDao.class)
                : Specification.anyOf();
        Page<CostCenterDao> persons = costCenterRepo.findAll(spec, pageable);
        return persons.stream().map(CostCenterDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CostCenterDto save(CostCenterDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CostCenterDao person = check
                ? costCenterRepo.getReferenceById(value.name())
                : new CostCenterDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CostCenterDto.fromDTO(value, person);
        return CostCenterDto.fromEntity(costCenterRepo.save(person));
    }

    @Override
    public void delete(String id) {
        costCenterRepo.deleteById(id);
    }
}