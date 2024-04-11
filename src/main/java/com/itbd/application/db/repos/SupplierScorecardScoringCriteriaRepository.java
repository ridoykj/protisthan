package com.itbd.application.db.repos;


import com.itbd.application.db.dao.supplier.SupplierScorecardScoringCriteriaDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierScorecardScoringCriteriaRepository extends JpaRepository<SupplierScorecardScoringCriteriaDao, String>, JpaSpecificationExecutor<SupplierScorecardScoringCriteriaDao> {
}
