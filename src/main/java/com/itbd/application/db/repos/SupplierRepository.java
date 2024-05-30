package com.itbd.application.db.repos;


import com.itbd.application.db.dao.buying.supplier.SupplierDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierRepository extends JpaRepository<SupplierDao, String>, JpaSpecificationExecutor<SupplierDao> {
}
