package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseInvoiceItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseInvoiceItemRepository extends JpaRepository<PurchaseInvoiceItemDao, String>, JpaSpecificationExecutor<PurchaseInvoiceItemDao> {
}
