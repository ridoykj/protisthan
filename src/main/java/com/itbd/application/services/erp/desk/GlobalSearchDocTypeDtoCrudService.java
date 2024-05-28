package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.GlobalSearchDocTypeDao;
import com.itbd.application.db.dto.GlobalSearchDocTypeDto;
import com.itbd.application.db.repos.GlobalSearchDocTypeRepository;
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
public class GlobalSearchDocTypeDtoCrudService implements CrudService<GlobalSearchDocTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final GlobalSearchDocTypeRepository globalSearchDocTypeRepo;

    public GlobalSearchDocTypeDtoCrudService(GlobalSearchDocTypeRepository globalSearchDocTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.globalSearchDocTypeRepo = globalSearchDocTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull GlobalSearchDocTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<GlobalSearchDocTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, GlobalSearchDocTypeDao.class)
                : Specification.anyOf();
        Page<GlobalSearchDocTypeDao> persons = globalSearchDocTypeRepo.findAll(spec, pageable);
        return persons.stream().map(GlobalSearchDocTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable GlobalSearchDocTypeDto save(GlobalSearchDocTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        GlobalSearchDocTypeDao person = check
                ? globalSearchDocTypeRepo.getReferenceById(value.name())
                : new GlobalSearchDocTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        GlobalSearchDocTypeDto.fromDTO(value, person);
        return GlobalSearchDocTypeDto.fromEntity(globalSearchDocTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        globalSearchDocTypeRepo.deleteById(id);
    }
}