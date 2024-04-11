package com.itbd.application.db.repos;


import com.itbd.application.db.dao.maintenance.MaintenanceScheduleItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaintenanceScheduleItemRepository extends JpaRepository<MaintenanceScheduleItemDao, String>, JpaSpecificationExecutor<MaintenanceScheduleItemDao> {
}
