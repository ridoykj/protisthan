package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.onboarding.OnboardingStepMapDao;
import com.itbd.application.db.dto.onboarding.OnboardingStepMapDto;
import com.itbd.application.db.repos.OnboardingStepMapRepository;
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
public class OnboardingStepMapDtoCrudService implements CrudService<OnboardingStepMapDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final OnboardingStepMapRepository onboardingStepMapRepo;

    public OnboardingStepMapDtoCrudService(OnboardingStepMapRepository onboardingStepMapRepo, JpaFilterConverter jpaFilterConverter) {
        this.onboardingStepMapRepo = onboardingStepMapRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull OnboardingStepMapDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<OnboardingStepMapDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, OnboardingStepMapDao.class)
                : Specification.anyOf();
        Page<OnboardingStepMapDao> persons = onboardingStepMapRepo.findAll(spec, pageable);
        return persons.stream().map(OnboardingStepMapDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable OnboardingStepMapDto save(OnboardingStepMapDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        OnboardingStepMapDao person = check
                ? onboardingStepMapRepo.getReferenceById(value.name())
                : new OnboardingStepMapDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        OnboardingStepMapDto.fromDTO(value, person);
        return OnboardingStepMapDto.fromEntity(onboardingStepMapRepo.save(person));
    }

    @Override
    public void delete(String id) {
        onboardingStepMapRepo.deleteById(id);
    }
}