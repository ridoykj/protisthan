package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.AccessLogDao;
import com.itbd.application.db.dto.AccessLogDto;
import com.itbd.application.db.repos.AccessLogRepository;
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
public class AccessLogDtoCrudService implements CrudService<AccessLogDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final AccessLogRepository accessLogRepo;

    public AccessLogDtoCrudService(AccessLogRepository accessLogRepo, JpaFilterConverter jpaFilterConverter) {
        this.accessLogRepo = accessLogRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull AccessLogDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<AccessLogDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, AccessLogDao.class)
                : Specification.anyOf();
        Page<AccessLogDao> persons = accessLogRepo.findAll(spec, pageable);
        return persons.stream().map(AccessLogDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable AccessLogDto save(AccessLogDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        AccessLogDao person = check
                ? accessLogRepo.getReferenceById(value.name())
                : new AccessLogDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        AccessLogDto.fromDTO(value, person);
        return AccessLogDto.fromEntity(accessLogRepo.save(person));
    }

    @Override
    public void delete(String id) {
        accessLogRepo.deleteById(id);
    }
}