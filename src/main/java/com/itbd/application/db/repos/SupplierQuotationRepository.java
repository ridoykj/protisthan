package com.itbd.application.db.repos;


import com.itbd.application.db.dao.supplier.SupplierQuotationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierQuotationRepository extends JpaRepository<SupplierQuotationDao, String>, JpaSpecificationExecutor<SupplierQuotationDao> {
}
