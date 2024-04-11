package com.itbd.application.db.repos;


import com.itbd.application.db.dao.production.ProductionPlanItemReferenceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductionPlanItemReferenceRepository extends JpaRepository<ProductionPlanItemReferenceDao, String>, JpaSpecificationExecutor<ProductionPlanItemReferenceDao> {
}
