package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.production.ProductionPlanMaterialRequestWarehouseDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductionPlanMaterialRequestWarehouseRepository extends JpaRepository<ProductionPlanMaterialRequestWarehouseDao, String>, JpaSpecificationExecutor<ProductionPlanMaterialRequestWarehouseDao> {
}
