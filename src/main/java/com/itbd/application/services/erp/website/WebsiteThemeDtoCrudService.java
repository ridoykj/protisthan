package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.website.website.WebsiteThemeDao;
import com.itbd.application.db.dto.website.WebsiteThemeDto;
import com.itbd.application.db.repos.WebsiteThemeRepository;
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
public class WebsiteThemeDtoCrudService implements CrudService<WebsiteThemeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final WebsiteThemeRepository websiteThemeRepo;

    public WebsiteThemeDtoCrudService(WebsiteThemeRepository websiteThemeRepo, JpaFilterConverter jpaFilterConverter) {
        this.websiteThemeRepo = websiteThemeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull WebsiteThemeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<WebsiteThemeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, WebsiteThemeDao.class)
                : Specification.anyOf();
        Page<WebsiteThemeDao> persons = websiteThemeRepo.findAll(spec, pageable);
        return persons.stream().map(WebsiteThemeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable WebsiteThemeDto save(WebsiteThemeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        WebsiteThemeDao person = check
                ? websiteThemeRepo.getReferenceById(value.name())
                : new WebsiteThemeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        WebsiteThemeDto.fromDTO(value, person);
        return WebsiteThemeDto.fromEntity(websiteThemeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        websiteThemeRepo.deleteById(id);
    }
}