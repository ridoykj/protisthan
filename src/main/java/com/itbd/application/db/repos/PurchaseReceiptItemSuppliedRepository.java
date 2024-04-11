package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseReceiptItemSuppliedDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseReceiptItemSuppliedRepository extends JpaRepository<PurchaseReceiptItemSuppliedDao, String>, JpaSpecificationExecutor<PurchaseReceiptItemSuppliedDao> {
}
