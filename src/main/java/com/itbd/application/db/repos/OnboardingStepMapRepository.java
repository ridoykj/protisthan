package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.onboarding.OnboardingStepMapDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OnboardingStepMapRepository extends JpaRepository<OnboardingStepMapDao, String>, JpaSpecificationExecutor<OnboardingStepMapDao> {
}
