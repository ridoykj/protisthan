package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.doctypes.DocTypeActionDao;
import com.itbd.application.db.dto.doctypes.DocTypeActionDto;
import com.itbd.application.db.repos.DocTypeActionRepository;
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
public class DocTypeActionDtoCrudService implements CrudService<DocTypeActionDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DocTypeActionRepository docTypeActionRepo;

    public DocTypeActionDtoCrudService(DocTypeActionRepository docTypeActionRepo, JpaFilterConverter jpaFilterConverter) {
        this.docTypeActionRepo = docTypeActionRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DocTypeActionDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DocTypeActionDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DocTypeActionDao.class)
                : Specification.anyOf();
        Page<DocTypeActionDao> persons = docTypeActionRepo.findAll(spec, pageable);
        return persons.stream().map(DocTypeActionDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DocTypeActionDto save(DocTypeActionDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DocTypeActionDao person = check
                ? docTypeActionRepo.getReferenceById(value.name())
                : new DocTypeActionDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DocTypeActionDto.fromDTO(value, person);
        return DocTypeActionDto.fromEntity(docTypeActionRepo.save(person));
    }

    @Override
    public void delete(String id) {
        docTypeActionRepo.deleteById(id);
    }
}