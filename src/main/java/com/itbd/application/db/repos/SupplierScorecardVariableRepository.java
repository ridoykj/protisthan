package com.itbd.application.db.repos;


import com.itbd.application.db.dao.supplier.SupplierScorecardVariableDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierScorecardVariableRepository extends JpaRepository<SupplierScorecardVariableDao, String>, JpaSpecificationExecutor<SupplierScorecardVariableDao> {
}
