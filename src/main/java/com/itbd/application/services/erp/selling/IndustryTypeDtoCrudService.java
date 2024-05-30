package com.itbd.application.services.erp.selling;

import com.itbd.application.db.dao.selling.IndustryTypeDao;
import com.itbd.application.db.dto.IndustryTypeDto;
import com.itbd.application.db.repos.IndustryTypeRepository;
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
public class IndustryTypeDtoCrudService implements CrudService<IndustryTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final IndustryTypeRepository industryTypeRepo;

    public IndustryTypeDtoCrudService(IndustryTypeRepository industryTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.industryTypeRepo = industryTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull IndustryTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<IndustryTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, IndustryTypeDao.class)
                : Specification.anyOf();
        Page<IndustryTypeDao> persons = industryTypeRepo.findAll(spec, pageable);
        return persons.stream().map(IndustryTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable IndustryTypeDto save(IndustryTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        IndustryTypeDao person = check
                ? industryTypeRepo.getReferenceById(value.name())
                : new IndustryTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        IndustryTypeDto.fromDTO(value, person);
        return IndustryTypeDto.fromEntity(industryTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        industryTypeRepo.deleteById(id);
    }
}