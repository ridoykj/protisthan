package com.itbd.application.services.erp.desk;

import com.itbd.application.db.dao.desk.onboarding.OnboardingPermissionDao;
import com.itbd.application.db.dto.onboarding.OnboardingPermissionDto;
import com.itbd.application.db.repos.OnboardingPermissionRepository;
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
public class OnboardingPermissionDtoCrudService implements CrudService<OnboardingPermissionDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final OnboardingPermissionRepository onboardingPermissionRepo;

    public OnboardingPermissionDtoCrudService(OnboardingPermissionRepository onboardingPermissionRepo, JpaFilterConverter jpaFilterConverter) {
        this.onboardingPermissionRepo = onboardingPermissionRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull OnboardingPermissionDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<OnboardingPermissionDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, OnboardingPermissionDao.class)
                : Specification.anyOf();
        Page<OnboardingPermissionDao> persons = onboardingPermissionRepo.findAll(spec, pageable);
        return persons.stream().map(OnboardingPermissionDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable OnboardingPermissionDto save(OnboardingPermissionDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        OnboardingPermissionDao person = check
                ? onboardingPermissionRepo.getReferenceById(value.name())
                : new OnboardingPermissionDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        OnboardingPermissionDto.fromDTO(value, person);
        return OnboardingPermissionDto.fromEntity(onboardingPermissionRepo.save(person));
    }

    @Override
    public void delete(String id) {
        onboardingPermissionRepo.deleteById(id);
    }
}