package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CostCenterAllocationPercentageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCostCenterAllocationPercentageRepository extends JpaRepository<CostCenterAllocationPercentageDao, String>, JpaSpecificationExecutor<CostCenterAllocationPercentageDao> {
}
