package com.itbd.application.db.repos;


import com.itbd.application.db.dao.maintenance.MaintenanceVisitDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaintenanceVisitRepository extends JpaRepository<MaintenanceVisitDao, String>, JpaSpecificationExecutor<MaintenanceVisitDao> {
}
