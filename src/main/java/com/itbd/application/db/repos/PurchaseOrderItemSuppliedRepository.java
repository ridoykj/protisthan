package com.itbd.application.db.repos;


import com.itbd.application.db.dao.buying.purchase.PurchaseOrderItemSuppliedDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseOrderItemSuppliedRepository extends JpaRepository<PurchaseOrderItemSuppliedDao, String>, JpaSpecificationExecutor<PurchaseOrderItemSuppliedDao> {
}
