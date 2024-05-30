package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.doc.DocTypeLinkDao;
import com.itbd.application.db.dto.doctypes.DocTypeLinkDto;
import com.itbd.application.db.repos.DocTypeLinkRepository;
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
public class DocTypeLinkDtoCrudService implements CrudService<DocTypeLinkDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DocTypeLinkRepository docTypeLinkRepo;

    public DocTypeLinkDtoCrudService(DocTypeLinkRepository docTypeLinkRepo, JpaFilterConverter jpaFilterConverter) {
        this.docTypeLinkRepo = docTypeLinkRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DocTypeLinkDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DocTypeLinkDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DocTypeLinkDao.class)
                : Specification.anyOf();
        Page<DocTypeLinkDao> persons = docTypeLinkRepo.findAll(spec, pageable);
        return persons.stream().map(DocTypeLinkDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DocTypeLinkDto save(DocTypeLinkDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DocTypeLinkDao person = check
                ? docTypeLinkRepo.getReferenceById(value.name())
                : new DocTypeLinkDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DocTypeLinkDto.fromDTO(value, person);
        return DocTypeLinkDto.fromEntity(docTypeLinkRepo.save(person));
    }

    @Override
    public void delete(String id) {
        docTypeLinkRepo.deleteById(id);
    }
}