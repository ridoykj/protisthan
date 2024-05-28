package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.website.component.WebTemplateFieldDao;
import com.itbd.application.db.dto.website.component.WebTemplateFieldDto;
import com.itbd.application.db.repos.WebTemplateFieldRepository;
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
public class WebTemplateFieldDtoCrudService implements CrudService<WebTemplateFieldDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WebTemplateFieldRepository webTemplateFieldRepo;

    public WebTemplateFieldDtoCrudService(WebTemplateFieldRepository webTemplateFieldRepo, JpaFilterConverter jpaFilterConverter) {
        this.webTemplateFieldRepo = webTemplateFieldRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WebTemplateFieldDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WebTemplateFieldDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WebTemplateFieldDao.class)
                : Specification.anyOf();
        Page<WebTemplateFieldDao> persons = webTemplateFieldRepo.findAll(spec, pageable);
        return persons.stream().map(WebTemplateFieldDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WebTemplateFieldDto save(WebTemplateFieldDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WebTemplateFieldDao person = check
                ? webTemplateFieldRepo.getReferenceById(value.name())
                : new WebTemplateFieldDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WebTemplateFieldDto.fromDTO(value, person);
        return WebTemplateFieldDto.fromEntity(webTemplateFieldRepo.save(person));
    }

    @Override
    public void delete(String id) {
        webTemplateFieldRepo.deleteById(id);
    }
}