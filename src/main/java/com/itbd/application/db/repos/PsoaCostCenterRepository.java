package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PsoaCostCenterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PsoaCostCenterRepository extends JpaRepository<PsoaCostCenterDao, String>, JpaSpecificationExecutor<PsoaCostCenterDao> {
}
