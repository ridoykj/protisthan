package com.itbd.application.db.repos;


import com.itbd.application.db.dao.maintenance.MaintenanceScheduleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaintenanceScheduleRepository extends JpaRepository<MaintenanceScheduleDao, String>, JpaSpecificationExecutor<MaintenanceScheduleDao> {
}
