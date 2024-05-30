package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.stock.StockReconciliationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StockReconciliationRepository extends JpaRepository<StockReconciliationDao, String>, JpaSpecificationExecutor<StockReconciliationDao> {
}
