package com.itbd.application.db.repos;


import com.itbd.application.db.dao.sales.SalesInvoiceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesInvoiceRepository extends JpaRepository<SalesInvoiceDao, String>, JpaSpecificationExecutor<SalesInvoiceDao> {
}
