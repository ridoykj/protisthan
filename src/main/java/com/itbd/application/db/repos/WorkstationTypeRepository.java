package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workstation.WorkstationTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkstationTypeRepository extends JpaRepository<WorkstationTypeDao, String>, JpaSpecificationExecutor<WorkstationTypeDao> {
}
