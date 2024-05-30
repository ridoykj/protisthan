package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.purchase.PurchaseInvoiceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseInvoiceRepository extends JpaRepository<PurchaseInvoiceDao, String>, JpaSpecificationExecutor<PurchaseInvoiceDao> {
}
