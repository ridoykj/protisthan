package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProductionPlanDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductionPlanRepository extends JpaRepository<ProductionPlanDao, String>, JpaSpecificationExecutor<ProductionPlanDao> {
}
