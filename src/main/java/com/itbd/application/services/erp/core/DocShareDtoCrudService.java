package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.doc.DocShareDao;
import com.itbd.application.db.dto.doctypes.DocShareDto;
import com.itbd.application.db.repos.DocShareRepository;
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
public class DocShareDtoCrudService implements CrudService<DocShareDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DocShareRepository docShareRepo;

    public DocShareDtoCrudService(DocShareRepository docShareRepo, JpaFilterConverter jpaFilterConverter) {
        this.docShareRepo = docShareRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DocShareDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DocShareDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DocShareDao.class)
                : Specification.anyOf();
        Page<DocShareDao> persons = docShareRepo.findAll(spec, pageable);
        return persons.stream().map(DocShareDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DocShareDto save(DocShareDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DocShareDao person = check
                ? docShareRepo.getReferenceById(value.name())
                : new DocShareDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DocShareDto.fromDTO(value, person);
        return DocShareDto.fromEntity(docShareRepo.save(person));
    }

    @Override
    public void delete(String id) {
        docShareRepo.deleteById(id);
    }
}