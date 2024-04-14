package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ClosingStockBalanceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabClosingStockBalanceRepository extends JpaRepository<ClosingStockBalanceDao, String>, JpaSpecificationExecutor<ClosingStockBalanceDao> {
}
