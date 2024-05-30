package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.CostCenterAllocationPercentageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CostCenterAllocationPercentageRepository extends JpaRepository<CostCenterAllocationPercentageDao, String>, JpaSpecificationExecutor<CostCenterAllocationPercentageDao> {
}
