package com.itbd.application.db.repos;


import com.itbd.application.db.dao.production.ProductionPlanMaterialRequestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductionPlanMaterialRequestRepository extends JpaRepository<ProductionPlanMaterialRequestDao, String>, JpaSpecificationExecutor<ProductionPlanMaterialRequestDao> {
}
