package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.website.component.WebFormFieldDao;
import com.itbd.application.db.dto.website.component.WebFormFieldDto;
import com.itbd.application.db.repos.WebFormFieldRepository;
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
public class WebFormFieldDtoCrudService implements CrudService<WebFormFieldDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WebFormFieldRepository webFormFieldRepo;

    public WebFormFieldDtoCrudService(WebFormFieldRepository webFormFieldRepo, JpaFilterConverter jpaFilterConverter) {
        this.webFormFieldRepo = webFormFieldRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WebFormFieldDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WebFormFieldDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WebFormFieldDao.class)
                : Specification.anyOf();
        Page<WebFormFieldDao> persons = webFormFieldRepo.findAll(spec, pageable);
        return persons.stream().map(WebFormFieldDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WebFormFieldDto save(WebFormFieldDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WebFormFieldDao person = check
                ? webFormFieldRepo.getReferenceById(value.name())
                : new WebFormFieldDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WebFormFieldDto.fromDTO(value, person);
        return WebFormFieldDto.fromEntity(webFormFieldRepo.save(person));
    }

    @Override
    public void delete(String id) {
        webFormFieldRepo.deleteById(id);
    }
}