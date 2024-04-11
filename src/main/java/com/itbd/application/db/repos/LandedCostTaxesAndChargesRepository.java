package com.itbd.application.db.repos;


import com.itbd.application.db.dao.landedcost.LandedCostTaxesAndChargesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LandedCostTaxesAndChargesRepository extends JpaRepository<LandedCostTaxesAndChargesDao, String>, JpaSpecificationExecutor<LandedCostTaxesAndChargesDao> {
}
