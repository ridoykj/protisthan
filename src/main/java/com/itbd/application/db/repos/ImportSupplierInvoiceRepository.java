package com.itbd.application.db.repos;

import com.itbd.application.db.dao.regional.ImportSupplierInvoiceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ImportSupplierInvoiceRepository extends JpaRepository<ImportSupplierInvoiceDao, String>, JpaSpecificationExecutor<ImportSupplierInvoiceDao> {
}
