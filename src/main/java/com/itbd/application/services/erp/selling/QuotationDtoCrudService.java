package com.itbd.application.services.erp.selling;

import com.itbd.application.db.dao.quotations.QuotationDao;
import com.itbd.application.db.dto.quotations.QuotationDto;
import com.itbd.application.db.repos.QuotationRepository;
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
public class QuotationDtoCrudService implements CrudService<QuotationDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final QuotationRepository quotationRepo;

    public QuotationDtoCrudService(QuotationRepository quotationRepo, JpaFilterConverter jpaFilterConverter) {
        this.quotationRepo = quotationRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull QuotationDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<QuotationDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, QuotationDao.class)
                : Specification.anyOf();
        Page<QuotationDao> persons = quotationRepo.findAll(spec, pageable);
        return persons.stream().map(QuotationDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable QuotationDto save(QuotationDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        QuotationDao person = check
                ? quotationRepo.getReferenceById(value.name())
                : new QuotationDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        QuotationDto.fromDTO(value, person);
        return QuotationDto.fromEntity(quotationRepo.save(person));
    }

    @Override
    public void delete(String id) {
        quotationRepo.deleteById(id);
    }
}