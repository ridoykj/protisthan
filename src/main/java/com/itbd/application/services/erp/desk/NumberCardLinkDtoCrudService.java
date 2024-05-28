package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.NumberCardLinkDao;
import com.itbd.application.db.dto.NumberCardLinkDto;
import com.itbd.application.db.repos.NumberCardLinkRepository;
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
public class NumberCardLinkDtoCrudService implements CrudService<NumberCardLinkDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final NumberCardLinkRepository numberCardLinkRepo;

    public NumberCardLinkDtoCrudService(NumberCardLinkRepository numberCardLinkRepo, JpaFilterConverter jpaFilterConverter) {
        this.numberCardLinkRepo = numberCardLinkRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull NumberCardLinkDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<NumberCardLinkDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, NumberCardLinkDao.class)
                : Specification.anyOf();
        Page<NumberCardLinkDao> persons = numberCardLinkRepo.findAll(spec, pageable);
        return persons.stream().map(NumberCardLinkDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable NumberCardLinkDto save(NumberCardLinkDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        NumberCardLinkDao person = check
                ? numberCardLinkRepo.getReferenceById(value.name())
                : new NumberCardLinkDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        NumberCardLinkDto.fromDTO(value, person);
        return NumberCardLinkDto.fromEntity(numberCardLinkRepo.save(person));
    }

    @Override
    public void delete(String id) {
        numberCardLinkRepo.deleteById(id);
    }
}