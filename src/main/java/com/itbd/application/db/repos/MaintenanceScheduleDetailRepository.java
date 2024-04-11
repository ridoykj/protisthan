package com.itbd.application.db.repos;


import com.itbd.application.db.dao.maintenance.MaintenanceScheduleDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaintenanceScheduleDetailRepository extends JpaRepository<MaintenanceScheduleDetailDao, String>, JpaSpecificationExecutor<MaintenanceScheduleDetailDao> {
}
