package com.itbd.application.db.repos;


import com.itbd.application.db.dao.supplier.SupplierScorecardScoringVariableDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierScorecardScoringVariableRepository extends JpaRepository<SupplierScorecardScoringVariableDao, String>, JpaSpecificationExecutor<SupplierScorecardScoringVariableDao> {
}
