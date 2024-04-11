package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseOrderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderDao, String>, JpaSpecificationExecutor<PurchaseOrderDao> {
}
