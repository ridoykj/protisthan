package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.FormTourDao;
import com.itbd.application.db.dto.FormTourDto;
import com.itbd.application.db.repos.FormTourRepository;
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
public class FormTourDtoCrudService implements CrudService<FormTourDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final FormTourRepository formTourRepo;

    public FormTourDtoCrudService(FormTourRepository formTourRepo, JpaFilterConverter jpaFilterConverter) {
        this.formTourRepo = formTourRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull FormTourDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<FormTourDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, FormTourDao.class)
                : Specification.anyOf();
        Page<FormTourDao> persons = formTourRepo.findAll(spec, pageable);
        return persons.stream().map(FormTourDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable FormTourDto save(FormTourDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        FormTourDao person = check
                ? formTourRepo.getReferenceById(value.name())
                : new FormTourDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        FormTourDto.fromDTO(value, person);
        return FormTourDto.fromEntity(formTourRepo.save(person));
    }

    @Override
    public void delete(String id) {
        formTourRepo.deleteById(id);
    }
}