package com.itbd.application.db.repos;

import com.itbd.application.db.dao.InstalledApplicationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface InstalledApplicationRepository extends JpaRepository<InstalledApplicationDao, String>, JpaSpecificationExecutor<InstalledApplicationDao> {
}
