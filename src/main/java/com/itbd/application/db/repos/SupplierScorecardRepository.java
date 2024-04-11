package com.itbd.application.db.repos;


import com.itbd.application.db.dao.supplier.SupplierScorecardDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierScorecardRepository extends JpaRepository<SupplierScorecardDao, String>, JpaSpecificationExecutor<SupplierScorecardDao> {
}
