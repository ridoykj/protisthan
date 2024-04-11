package com.itbd.application.db.repos;


import com.itbd.application.db.dao.sales.SalesInvoiceAdvanceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesInvoiceAdvanceRepository extends JpaRepository<SalesInvoiceAdvanceDao, String>, JpaSpecificationExecutor<SalesInvoiceAdvanceDao> {
}
