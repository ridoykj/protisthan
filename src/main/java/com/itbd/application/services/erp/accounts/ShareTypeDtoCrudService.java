package com.itbd.application.services.erp.accounts;

import com.itbd.application.db.dao.shares.ShareTypeDao;
import com.itbd.application.db.dto.shares.ShareTypeDto;
import com.itbd.application.db.repos.ShareTypeRepository;
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
public class ShareTypeDtoCrudService implements CrudService<ShareTypeDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final ShareTypeRepository shareTypeRepo;

    public ShareTypeDtoCrudService(ShareTypeRepository shareTypeRepo, JpaFilterConverter jpaFilterConverter) {
        this.shareTypeRepo = shareTypeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull ShareTypeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<ShareTypeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, ShareTypeDao.class)
                : Specification.anyOf();
        Page<ShareTypeDao> persons = shareTypeRepo.findAll(spec, pageable);
        return persons.stream().map(ShareTypeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable ShareTypeDto save(ShareTypeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        ShareTypeDao person = check
                ? shareTypeRepo.getReferenceById(value.name())
                : new ShareTypeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        ShareTypeDto.fromDTO(value, person);
        return ShareTypeDto.fromEntity(shareTypeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        shareTypeRepo.deleteById(id);
    }
}