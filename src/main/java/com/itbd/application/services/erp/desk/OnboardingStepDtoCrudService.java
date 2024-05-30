package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.onboarding.OnboardingStepDao;
import com.itbd.application.db.dto.onboarding.OnboardingStepDto;
import com.itbd.application.db.repos.OnboardingStepRepository;
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
public class OnboardingStepDtoCrudService implements CrudService<OnboardingStepDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final OnboardingStepRepository onboardingStepRepo;

    public OnboardingStepDtoCrudService(OnboardingStepRepository onboardingStepRepo, JpaFilterConverter jpaFilterConverter) {
        this.onboardingStepRepo = onboardingStepRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull OnboardingStepDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<OnboardingStepDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, OnboardingStepDao.class)
                : Specification.anyOf();
        Page<OnboardingStepDao> persons = onboardingStepRepo.findAll(spec, pageable);
        return persons.stream().map(OnboardingStepDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable OnboardingStepDto save(OnboardingStepDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        OnboardingStepDao person = check
                ? onboardingStepRepo.getReferenceById(value.name())
                : new OnboardingStepDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        OnboardingStepDto.fromDTO(value, person);
        return OnboardingStepDto.fromEntity(onboardingStepRepo.save(person));
    }

    @Override
    public void delete(String id) {
        onboardingStepRepo.deleteById(id);
    }
}