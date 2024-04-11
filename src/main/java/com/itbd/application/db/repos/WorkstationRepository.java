package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workstation.WorkstationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkstationRepository extends JpaRepository<WorkstationDao, String>, JpaSpecificationExecutor<WorkstationDao> {
}
