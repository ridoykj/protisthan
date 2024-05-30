package com.itbd.application.db.repos;


import com.itbd.application.db.dao.project_integrations.TallyMigrationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TallyMigrationRepository extends JpaRepository<TallyMigrationDao, String>, JpaSpecificationExecutor<TallyMigrationDao> {
}
