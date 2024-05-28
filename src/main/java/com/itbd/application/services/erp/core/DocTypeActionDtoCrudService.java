package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.doctypes.DocTypeDao;
import com.itbd.application.db.dto.doctypes.DocTypeDto;
import com.itbd.application.db.repos.DocTypeRepository;
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
public class DocTypeDtoCrudService implements CrudService<DocTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DocTypeRepository docTypeRepo;

    public DocTypeDtoCrudService(DocTypeRepository docPermRepo, JpaFilterConverter jpaFilterConverter) {
        this.docTypeRepo = docPermRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DocTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DocTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DocTypeDao.class)
                : Specification.anyOf();
        Page<DocTypeDao> persons = docTypeRepo.findAll(spec, pageable);
        return persons.stream().map(DocTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DocTypeDto save(DocTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DocTypeDao person = check
                ? docTypeRepo.getReferenceById(value.name())
                : new DocTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DocTypeDto.fromDTO(value, person);
        return DocTypeDto.fromEntity(docTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        docTypeRepo.deleteById(id);
    }
}