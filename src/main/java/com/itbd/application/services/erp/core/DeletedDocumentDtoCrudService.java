package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.DeletedDocumentDao;
import com.itbd.application.db.dto.DeletedDocumentDto;
import com.itbd.application.db.repos.DeletedDocumentRepository;
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
public class DeletedDocumentDtoCrudService implements CrudService<DeletedDocumentDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DeletedDocumentRepository deletedDocumentRepo;

    public DeletedDocumentDtoCrudService(DeletedDocumentRepository deletedDocumentRepo, JpaFilterConverter jpaFilterConverter) {
        this.deletedDocumentRepo = deletedDocumentRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DeletedDocumentDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DeletedDocumentDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DeletedDocumentDao.class)
                : Specification.anyOf();
        Page<DeletedDocumentDao> persons = deletedDocumentRepo.findAll(spec, pageable);
        return persons.stream().map(DeletedDocumentDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DeletedDocumentDto save(DeletedDocumentDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DeletedDocumentDao person = check
                ? deletedDocumentRepo.getReferenceById(value.name())
                : new DeletedDocumentDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DeletedDocumentDto.fromDTO(value, person);
        return DeletedDocumentDto.fromEntity(deletedDocumentRepo.save(person));
    }

    @Override
    public void delete(String id) {
        deletedDocumentRepo.deleteById(id);
    }
}