package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CostCenterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCostCenterRepository extends JpaRepository<CostCenterDao, String>, JpaSpecificationExecutor<CostCenterDao> {
}
