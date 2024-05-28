package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.RouteHistoryDao;
import com.itbd.application.db.dto.RouteHistoryDto;
import com.itbd.application.db.repos.RouteHistoryRepository;
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
public class RouteHistoryDtoCrudService implements CrudService<RouteHistoryDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final RouteHistoryRepository routeHistoryRepo;

    public RouteHistoryDtoCrudService(RouteHistoryRepository routeHistoryRepo, JpaFilterConverter jpaFilterConverter) {
        this.routeHistoryRepo = routeHistoryRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull RouteHistoryDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<RouteHistoryDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, RouteHistoryDao.class)
                : Specification.anyOf();
        Page<RouteHistoryDao> persons = routeHistoryRepo.findAll(spec, pageable);
        return persons.stream().map(RouteHistoryDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable RouteHistoryDto save(RouteHistoryDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        RouteHistoryDao person = check
                ? routeHistoryRepo.getReferenceById(value.name())
                : new RouteHistoryDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        RouteHistoryDto.fromDTO(value, person);
        return RouteHistoryDto.fromEntity(routeHistoryRepo.save(person));
    }

    @Override
    public void delete(String id) {
        routeHistoryRepo.deleteById(id);
    }
}