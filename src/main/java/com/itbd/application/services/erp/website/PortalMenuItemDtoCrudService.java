package com.itbd.application.services.erp.website;

import com.itbd.application.db.dao.PortalMenuItemDao;
import com.itbd.application.db.dto.PortalMenuItemDto;
import com.itbd.application.db.repos.PortalMenuItemRepository;
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
public class PortalMenuItemDtoCrudService implements CrudService<PortalMenuItemDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PortalMenuItemRepository portalMenuItemRepo;

    public PortalMenuItemDtoCrudService(PortalMenuItemRepository portalMenuItemRepo, JpaFilterConverter jpaFilterConverter) {
        this.portalMenuItemRepo = portalMenuItemRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PortalMenuItemDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PortalMenuItemDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PortalMenuItemDao.class)
                : Specification.anyOf();
        Page<PortalMenuItemDao> persons = portalMenuItemRepo.findAll(spec, pageable);
        return persons.stream().map(PortalMenuItemDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PortalMenuItemDto save(PortalMenuItemDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PortalMenuItemDao person = check
                ? portalMenuItemRepo.getReferenceById(value.name())
                : new PortalMenuItemDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PortalMenuItemDto.fromDTO(value, person);
        return PortalMenuItemDto.fromEntity(portalMenuItemRepo.save(person));
    }

    @Override
    public void delete(String id) {
        portalMenuItemRepo.deleteById(id);
    }
}