package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.DesignationDao;
import com.itbd.application.db.dto.DesignationDto;
import com.itbd.application.db.repos.DesignationRepository;
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
public class DesignationDtoCrudService implements CrudService<DesignationDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DesignationRepository designationRepo;

    public DesignationDtoCrudService(DesignationRepository designationRepo, JpaFilterConverter jpaFilterConverter) {
        this.designationRepo = designationRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DesignationDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DesignationDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DesignationDao.class)
                : Specification.anyOf();
        Page<DesignationDao> persons = designationRepo.findAll(spec, pageable);
        return persons.stream().map(DesignationDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable DesignationDto save(DesignationDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DesignationDao person = check
                ? designationRepo.getReferenceById(value.name())
                : new DesignationDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DesignationDto.fromDTO(value, person);
        return DesignationDto.fromEntity(designationRepo.save(person));
    }

    @Override
    public void delete(String id) {
        designationRepo.deleteById(id);
    }
}