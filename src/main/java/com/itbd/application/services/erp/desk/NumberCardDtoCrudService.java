package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.NumberCardDao;
import com.itbd.application.db.dto.NumberCardDto;
import com.itbd.application.db.repos.NumberCardRepository;
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
public class NumberCardDtoCrudService implements CrudService<NumberCardDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final NumberCardRepository numberCardRepo;

    public NumberCardDtoCrudService(NumberCardRepository numberCardRepo, JpaFilterConverter jpaFilterConverter) {
        this.numberCardRepo = numberCardRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull NumberCardDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<NumberCardDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, NumberCardDao.class)
                : Specification.anyOf();
        Page<NumberCardDao> persons = numberCardRepo.findAll(spec, pageable);
        return persons.stream().map(NumberCardDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable NumberCardDto save(NumberCardDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        NumberCardDao person = check
                ? numberCardRepo.getReferenceById(value.name())
                : new NumberCardDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        NumberCardDto.fromDTO(value, person);
        return NumberCardDto.fromEntity(numberCardRepo.save(person));
    }

    @Override
    public void delete(String id) {
        numberCardRepo.deleteById(id);
    }
}