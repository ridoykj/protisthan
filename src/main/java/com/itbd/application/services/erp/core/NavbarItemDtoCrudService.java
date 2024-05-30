package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.NavbarItemDao;
import com.itbd.application.db.dto.NavbarItemDto;
import com.itbd.application.db.repos.NavbarItemRepository;
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
public class NavbarItemDtoCrudService implements CrudService<NavbarItemDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final NavbarItemRepository navbarItemRepo;

    public NavbarItemDtoCrudService(NavbarItemRepository navbarItemRepo, JpaFilterConverter jpaFilterConverter) {
        this.navbarItemRepo = navbarItemRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull NavbarItemDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<NavbarItemDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, NavbarItemDao.class)
                : Specification.anyOf();
        Page<NavbarItemDao> persons = navbarItemRepo.findAll(spec, pageable);
        return persons.stream().map(NavbarItemDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable NavbarItemDto save(NavbarItemDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        NavbarItemDao person = check
                ? navbarItemRepo.getReferenceById(value.name())
                : new NavbarItemDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        NavbarItemDto.fromDTO(value, person);
        return NavbarItemDto.fromEntity(navbarItemRepo.save(person));
    }

    @Override
    public void delete(String id) {
        navbarItemRepo.deleteById(id);
    }
}