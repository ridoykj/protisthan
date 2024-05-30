package com.itbd.application.db.repos;


import com.itbd.application.db.dao.buying.supplier.SupplierQuotationItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierQuotationItemRepository extends JpaRepository<SupplierQuotationItemDao, String>, JpaSpecificationExecutor<SupplierQuotationItemDao> {
}
