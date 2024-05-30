package com.itbd.application.db.repos;

import com.itbd.application.db.dao.stock.InventoryDimensionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface InventoryDimensionRepository extends JpaRepository<InventoryDimensionDao, String>, JpaSpecificationExecutor<InventoryDimensionDao> {
}
