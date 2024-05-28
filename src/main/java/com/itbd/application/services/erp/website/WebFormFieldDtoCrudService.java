package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.website.component.WebFormDao;
import com.itbd.application.db.dto.website.component.WebFormDto;
import com.itbd.application.db.repos.WebFormRepository;
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
public class WebFormDtoCrudService implements CrudService<WebFormDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WebFormRepository webFormRepo;

    public WebFormDtoCrudService(WebFormRepository webFormRepo, JpaFilterConverter jpaFilterConverter) {
        this.webFormRepo = webFormRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WebFormDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WebFormDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WebFormDao.class)
                : Specification.anyOf();
        Page<WebFormDao> persons = webFormRepo.findAll(spec, pageable);
        return persons.stream().map(WebFormDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WebFormDto save(WebFormDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WebFormDao person = check
                ? webFormRepo.getReferenceById(value.name())
                : new WebFormDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WebFormDto.fromDTO(value, person);
        return WebFormDto.fromEntity(webFormRepo.save(person));
    }

    @Override
    public void delete(String id) {
        webFormRepo.deleteById(id);
    }
}