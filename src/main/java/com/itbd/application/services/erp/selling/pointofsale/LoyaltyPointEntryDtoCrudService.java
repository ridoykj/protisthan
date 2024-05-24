package com.itbd.application.services.erp.selling.pointofsale;

import com.itbd.application.db.dao.loyaltys.LoyaltyPointEntryDao;
import com.itbd.application.db.dto.loyaltys.LoyaltyPointEntryDto;
import com.itbd.application.db.repos.LoyaltyPointEntryRepository;
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
public class LoyaltyPointEntryDtoCrudService implements CrudService<LoyaltyPointEntryDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final LoyaltyPointEntryRepository loyaltyPointEntryRepo;

    public LoyaltyPointEntryDtoCrudService(LoyaltyPointEntryRepository loyaltyPointEntryRepo, JpaFilterConverter jpaFilterConverter) {
        this.loyaltyPointEntryRepo = loyaltyPointEntryRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull LoyaltyPointEntryDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<LoyaltyPointEntryDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, LoyaltyPointEntryDao.class)
                : Specification.anyOf();
        Page<LoyaltyPointEntryDao> persons = loyaltyPointEntryRepo.findAll(spec, pageable);
        return persons.stream().map(LoyaltyPointEntryDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable LoyaltyPointEntryDto save(LoyaltyPointEntryDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        LoyaltyPointEntryDao person = check
                ? loyaltyPointEntryRepo.getReferenceById(value.name())
                : new LoyaltyPointEntryDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        LoyaltyPointEntryDto.fromDTO(value, person);
        return LoyaltyPointEntryDto.fromEntity(loyaltyPointEntryRepo.save(person));
    }

    @Override
    public void delete(String id) {
        loyaltyPointEntryRepo.deleteById(id);
    }
}