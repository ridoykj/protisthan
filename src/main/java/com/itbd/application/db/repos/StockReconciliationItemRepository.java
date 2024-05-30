package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.stock.StockReconciliationItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StockReconciliationItemRepository extends JpaRepository<StockReconciliationItemDao, String>, JpaSpecificationExecutor<StockReconciliationItemDao> {
}
