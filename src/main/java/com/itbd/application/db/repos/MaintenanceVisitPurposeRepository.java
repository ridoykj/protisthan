package com.itbd.application.db.repos;


import com.itbd.application.db.dao.maintenance.MaintenanceVisitPurposeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaintenanceVisitPurposeRepository extends JpaRepository<MaintenanceVisitPurposeDao, String>, JpaSpecificationExecutor<MaintenanceVisitPurposeDao> {
}
