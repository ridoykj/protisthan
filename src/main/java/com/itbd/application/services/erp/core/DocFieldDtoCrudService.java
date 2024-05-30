package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.doc.DocFieldDao;
import com.itbd.application.db.dto.doctypes.DocFieldDto;
import com.itbd.application.db.repos.DocFieldRepository;
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
public class DocFieldDtoCrudService implements CrudService<DocFieldDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DocFieldRepository docFieldRepo;

    public DocFieldDtoCrudService(DocFieldRepository docFieldRepo, JpaFilterConverter jpaFilterConverter) {
        this.docFieldRepo = docFieldRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DocFieldDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DocFieldDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DocFieldDao.class)
                : Specification.anyOf();
        Page<DocFieldDao> persons = docFieldRepo.findAll(spec, pageable);
        return persons.stream().map(DocFieldDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DocFieldDto save(DocFieldDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DocFieldDao person = check
                ? docFieldRepo.getReferenceById(value.name())
                : new DocFieldDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DocFieldDto.fromDTO(value, person);
        return DocFieldDto.fromEntity(docFieldRepo.save(person));
    }

    @Override
    public void delete(String id) {
        docFieldRepo.deleteById(id);
    }
}