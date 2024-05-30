package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.production.ProductionPlanSalesOrderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductionPlanSalesOrderRepository extends JpaRepository<ProductionPlanSalesOrderDao, String>, JpaSpecificationExecutor<ProductionPlanSalesOrderDao> {
}
