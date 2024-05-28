package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.CompanyDao;
import com.itbd.application.db.dto.CompanyDto;
import com.itbd.application.db.repos.CompanyRepository;
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
public class CompanyDtoCrudService implements CrudService<CompanyDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CompanyRepository companyRepo;

    public CompanyDtoCrudService(CompanyRepository companyRepo, JpaFilterConverter jpaFilterConverter) {
        this.companyRepo = companyRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CompanyDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CompanyDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CompanyDao.class)
                : Specification.anyOf();
        Page<CompanyDao> persons = companyRepo.findAll(spec, pageable);
        return persons.stream().map(CompanyDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CompanyDto save(CompanyDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CompanyDao person = check
                ? companyRepo.getReferenceById(value.name())
                : new CompanyDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CompanyDto.fromDTO(value, person);
        return CompanyDto.fromEntity(companyRepo.save(person));
    }

    @Override
    public void delete(String id) {
        companyRepo.deleteById(id);
    }
}