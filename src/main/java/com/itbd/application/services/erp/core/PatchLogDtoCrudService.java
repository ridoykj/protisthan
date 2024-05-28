package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.website.PageDao;
import com.itbd.application.db.dto.website.PageDto;
import com.itbd.application.db.repos.PageRepository;
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
public class PageDtoCrudService implements CrudService<PageDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PageRepository pageRepo;

    public PageDtoCrudService(PageRepository pageRepo, JpaFilterConverter jpaFilterConverter) {
        this.pageRepo = pageRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PageDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PageDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PageDao.class)
                : Specification.anyOf();
        Page<PageDao> persons = pageRepo.findAll(spec, pageable);
        return persons.stream().map(PageDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PageDto save(PageDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PageDao person = check
                ? pageRepo.getReferenceById(value.name())
                : new PageDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PageDto.fromDTO(value, person);
        return PageDto.fromEntity(pageRepo.save(person));
    }

    @Override
    public void delete(String id) {
        pageRepo.deleteById(id);
    }
}