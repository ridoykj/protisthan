package com.itbd.application.services.erp.selling.pointofsale;

import com.itbd.application.db.dao.loyaltys.LoyaltyProgramDao;
import com.itbd.application.db.dto.loyaltys.LoyaltyProgramDto;
import com.itbd.application.db.repos.LoyaltyProgramRepository;
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
public class LoyaltyProgramDtoCrudService implements CrudService<LoyaltyProgramDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final LoyaltyProgramRepository loyaltyProgramRepo;

    public LoyaltyProgramDtoCrudService(LoyaltyProgramRepository loyaltyProgramRepo, JpaFilterConverter jpaFilterConverter) {
        this.loyaltyProgramRepo = loyaltyProgramRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull LoyaltyProgramDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<LoyaltyProgramDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, LoyaltyProgramDao.class)
                : Specification.anyOf();
        Page<LoyaltyProgramDao> persons = loyaltyProgramRepo.findAll(spec, pageable);
        return persons.stream().map(LoyaltyProgramDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable LoyaltyProgramDto save(LoyaltyProgramDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        LoyaltyProgramDao person = check
                ? loyaltyProgramRepo.getReferenceById(value.name())
                : new LoyaltyProgramDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        LoyaltyProgramDto.fromDTO(value, person);
        return LoyaltyProgramDto.fromEntity(loyaltyProgramRepo.save(person));
    }

    @Override
    public void delete(String id) {
        loyaltyProgramRepo.deleteById(id);
    }
}