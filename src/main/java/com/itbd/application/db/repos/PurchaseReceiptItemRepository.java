package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseReceiptItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseReceiptItemRepository extends JpaRepository<PurchaseReceiptItemDao, String>, JpaSpecificationExecutor<PurchaseReceiptItemDao> {
}
