package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.doctypes.DocTypeStateDao;
import com.itbd.application.db.dto.doctypes.DocTypeStateDto;
import com.itbd.application.db.repos.DocTypeStateRepository;
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
public class DocTypeStateDtoCrudService implements CrudService<DocTypeStateDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DocTypeStateRepository docTypeStateRepo;

    public DocTypeStateDtoCrudService(DocTypeStateRepository docTypeStateRepo, JpaFilterConverter jpaFilterConverter) {
        this.docTypeStateRepo = docTypeStateRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DocTypeStateDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DocTypeStateDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DocTypeStateDao.class)
                : Specification.anyOf();
        Page<DocTypeStateDao> persons = docTypeStateRepo.findAll(spec, pageable);
        return persons.stream().map(DocTypeStateDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DocTypeStateDto save(DocTypeStateDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DocTypeStateDao person = check
                ? docTypeStateRepo.getReferenceById(value.name())
                : new DocTypeStateDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DocTypeStateDto.fromDTO(value, person);
        return DocTypeStateDto.fromEntity(docTypeStateRepo.save(person));
    }

    @Override
    public void delete(String id) {
        docTypeStateRepo.deleteById(id);
    }
}