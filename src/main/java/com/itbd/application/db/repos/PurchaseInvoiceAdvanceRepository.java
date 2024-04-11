package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseInvoiceAdvanceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseInvoiceAdvanceRepository extends JpaRepository<PurchaseInvoiceAdvanceDao, String>, JpaSpecificationExecutor<PurchaseInvoiceAdvanceDao> {
}
