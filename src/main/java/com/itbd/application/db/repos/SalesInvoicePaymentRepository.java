package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.sales.SalesInvoicePaymentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesInvoicePaymentRepository extends JpaRepository<SalesInvoicePaymentDao, String>, JpaSpecificationExecutor<SalesInvoicePaymentDao> {
}
