package com.itbd.application.db.repos;


import com.itbd.application.db.dao.buying.supplier.SupplierScorecardScoringStandingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierScorecardScoringStandingRepository extends JpaRepository<SupplierScorecardScoringStandingDao, String>, JpaSpecificationExecutor<SupplierScorecardScoringStandingDao> {
}
