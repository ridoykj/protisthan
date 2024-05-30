package com.itbd.application.services.erp.stock;

import com.itbd.application.db.dao.stock.BinDao;
import com.itbd.application.db.dto.BinDto;
import com.itbd.application.db.repos.BinRepository;
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
public class BinDtoCrudService implements CrudService<BinDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final BinRepository binRepo;

    public BinDtoCrudService(BinRepository binRepo, JpaFilterConverter jpaFilterConverter) {
        this.binRepo = binRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull BinDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<BinDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, BinDao.class)
                : Specification.anyOf();
        Page<BinDao> persons = binRepo.findAll(spec, pageable);
        return persons.stream().map(BinDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable BinDto save(BinDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        BinDao person = check
                ? binRepo.getReferenceById(value.name())
                : new BinDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        BinDto.fromDTO(value, person);
        return BinDto.fromEntity(binRepo.save(person));
    }

    @Override
    public void delete(String id) {
        binRepo.deleteById(id);
    }
}