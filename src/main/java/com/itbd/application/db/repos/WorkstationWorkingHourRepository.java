package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.workstation.WorkstationWorkingHourDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkstationWorkingHourRepository extends JpaRepository<WorkstationWorkingHourDao, String>, JpaSpecificationExecutor<WorkstationWorkingHourDao> {
}
