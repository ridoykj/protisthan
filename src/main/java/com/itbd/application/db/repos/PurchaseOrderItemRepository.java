package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseOrderItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseOrderItemRepository extends JpaRepository<PurchaseOrderItemDao, String>, JpaSpecificationExecutor<PurchaseOrderItemDao> {
}
