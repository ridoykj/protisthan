package com.itbd.application.db.repos;


import com.itbd.application.db.dao.modules.ModuleOnboardingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ModuleOnboardingRepository extends JpaRepository<ModuleOnboardingDao, String>, JpaSpecificationExecutor<ModuleOnboardingDao> {
}
