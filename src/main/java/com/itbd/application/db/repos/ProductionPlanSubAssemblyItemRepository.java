package com.itbd.application.db.repos;


import com.itbd.application.db.dao.production.ProductionPlanSubAssemblyItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductionPlanSubAssemblyItemRepository extends JpaRepository<ProductionPlanSubAssemblyItemDao, String>, JpaSpecificationExecutor<ProductionPlanSubAssemblyItemDao> {
}
