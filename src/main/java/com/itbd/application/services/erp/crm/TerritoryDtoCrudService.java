package com.itbd.application.services.erp.crm;

import com.itbd.application.db.dao.TerritoryDao;
import com.itbd.application.db.dto.TerritoryDto;
import com.itbd.application.db.repos.TerritoryRepository;
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
public class TerritoryDtoCrudService implements CrudService<TerritoryDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final TerritoryRepository territoryRepo;

    public TerritoryDtoCrudService(TerritoryRepository territoryRepo, JpaFilterConverter jpaFilterConverter) {
        this.territoryRepo = territoryRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull TerritoryDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<TerritoryDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, TerritoryDao.class)
                : Specification.anyOf();
        Page<TerritoryDao> persons = territoryRepo.findAll(spec, pageable);
        return persons.stream().map(TerritoryDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable TerritoryDto save(TerritoryDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        TerritoryDao person = check
                ? territoryRepo.getReferenceById(value.name())
                : new TerritoryDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        TerritoryDto.fromDTO(value, person);
        return TerritoryDto.fromEntity(territoryRepo.save(person));
    }

    @Override
    public void delete(String id) {
        territoryRepo.deleteById(id);
    }
}