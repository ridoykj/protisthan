package com.itbd.application.db.repos;


import com.itbd.application.db.dao.production.ProductionPlanItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductionPlanItemRepository extends JpaRepository<ProductionPlanItemDao, String>, JpaSpecificationExecutor<ProductionPlanItemDao> {
}
