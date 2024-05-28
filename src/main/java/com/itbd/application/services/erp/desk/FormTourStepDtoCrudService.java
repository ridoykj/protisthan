package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.FormTourStepDao;
import com.itbd.application.db.dto.FormTourStepDto;
import com.itbd.application.db.repos.FormTourStepRepository;
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
public class FormTourStepDtoCrudService implements CrudService<FormTourStepDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final FormTourStepRepository formTourStepRepo;

    public FormTourStepDtoCrudService(FormTourStepRepository formTourStepRepo, JpaFilterConverter jpaFilterConverter) {
        this.formTourStepRepo = formTourStepRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull FormTourStepDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<FormTourStepDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, FormTourStepDao.class)
                : Specification.anyOf();
        Page<FormTourStepDao> persons = formTourStepRepo.findAll(spec, pageable);
        return persons.stream().map(FormTourStepDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable FormTourStepDto save(FormTourStepDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        FormTourStepDao person = check
                ? formTourStepRepo.getReferenceById(value.name())
                : new FormTourStepDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        FormTourStepDto.fromDTO(value, person);
        return FormTourStepDto.fromEntity(formTourStepRepo.save(person));
    }

    @Override
    public void delete(String id) {
        formTourStepRepo.deleteById(id);
    }
}