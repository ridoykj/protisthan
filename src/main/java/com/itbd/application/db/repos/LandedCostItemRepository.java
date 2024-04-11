package com.itbd.application.db.repos;


import com.itbd.application.db.dao.landedcost.LandedCostItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LandedCostItemRepository extends JpaRepository<LandedCostItemDao, String>, JpaSpecificationExecutor<LandedCostItemDao> {
}
