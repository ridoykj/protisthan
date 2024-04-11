package com.itbd.application.db.repos;


import com.itbd.application.db.dao.landedcost.LandedCostPurchaseReceiptDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LandedCostPurchaseReceiptRepository extends JpaRepository<LandedCostPurchaseReceiptDao, String>, JpaSpecificationExecutor<LandedCostPurchaseReceiptDao> {
}
