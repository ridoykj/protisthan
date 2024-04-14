package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CostCenterAllocationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CostCenterAllocationRepository extends JpaRepository<CostCenterAllocationDao, String>, JpaSpecificationExecutor<CostCenterAllocationDao> {
}
