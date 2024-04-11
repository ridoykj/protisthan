package com.itbd.application.db.repos;


import com.itbd.application.db.dao.supplier.SupplierScorecardStandingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierScorecardStandingRepository extends JpaRepository<SupplierScorecardStandingDao, String>, JpaSpecificationExecutor<SupplierScorecardStandingDao> {
}
