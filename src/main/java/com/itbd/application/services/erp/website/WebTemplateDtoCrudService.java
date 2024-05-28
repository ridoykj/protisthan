package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.website.component.WebTemplateDao;
import com.itbd.application.db.dto.website.component.WebTemplateDto;
import com.itbd.application.db.repos.WebTemplateRepository;
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
public class WebTemplateDtoCrudService implements CrudService<WebTemplateDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WebTemplateRepository webTemplateRepo;

    public WebTemplateDtoCrudService(WebTemplateRepository webTemplateRepo, JpaFilterConverter jpaFilterConverter) {
        this.webTemplateRepo = webTemplateRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WebTemplateDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WebTemplateDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WebTemplateDao.class)
                : Specification.anyOf();
        Page<WebTemplateDao> persons = webTemplateRepo.findAll(spec, pageable);
        return persons.stream().map(WebTemplateDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WebTemplateDto save(WebTemplateDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WebTemplateDao person = check
                ? webTemplateRepo.getReferenceById(value.name())
                : new WebTemplateDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WebTemplateDto.fromDTO(value, person);
        return WebTemplateDto.fromEntity(webTemplateRepo.save(person));
    }

    @Override
    public void delete(String id) {
        webTemplateRepo.deleteById(id);
    }
}