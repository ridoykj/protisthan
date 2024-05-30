
package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.CommentDao;
import com.itbd.application.db.dto.cummunication.CommentDto;
import com.itbd.application.db.repos.CommentRepository;
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
public class CommentDtoCrudService implements CrudService<CommentDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CommentRepository commentRepo;

    public CommentDtoCrudService(CommentRepository commentRepo, JpaFilterConverter jpaFilterConverter) {
        this.commentRepo = commentRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CommentDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CommentDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CommentDao.class)
                : Specification.anyOf();
        Page<CommentDao> persons = commentRepo.findAll(spec, pageable);
        return persons.stream().map(CommentDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CommentDto save(CommentDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CommentDao person = check
                ? commentRepo.getReferenceById(value.name())
                : new CommentDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CommentDto.fromDTO(value, person);
        return CommentDto.fromEntity(commentRepo.save(person));
    }

    @Override
    public void delete(String id) {
        commentRepo.deleteById(id);
    }
}