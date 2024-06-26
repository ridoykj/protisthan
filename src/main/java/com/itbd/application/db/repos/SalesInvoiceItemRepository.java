package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.sales.SalesInvoiceItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesInvoiceItemRepository extends JpaRepository<SalesInvoiceItemDao, String>, JpaSpecificationExecutor<SalesInvoiceItemDao> {
}
