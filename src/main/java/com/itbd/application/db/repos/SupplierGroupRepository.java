package com.itbd.application.db.repos;


import com.itbd.application.db.dao.supplier.SupplierGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierGroupRepository extends JpaRepository<SupplierGroupDao, String>, JpaSpecificationExecutor<SupplierGroupDao> {
}
