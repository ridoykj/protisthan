package com.itbd.application.db.repos;


import com.itbd.application.db.dao.sales.SalesInvoiceTimesheetDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesInvoiceTimesheetRepository extends JpaRepository<SalesInvoiceTimesheetDao, String>, JpaSpecificationExecutor<SalesInvoiceTimesheetDao> {
}
