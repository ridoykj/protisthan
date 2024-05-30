package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.onboarding.OnboardingStepDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OnboardingStepRepository extends JpaRepository<OnboardingStepDao, String>, JpaSpecificationExecutor<OnboardingStepDao> {
}
