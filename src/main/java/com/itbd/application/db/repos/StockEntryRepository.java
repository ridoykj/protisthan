package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.stock.StockEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StockEntryRepository extends JpaRepository<StockEntryDao, String>, JpaSpecificationExecutor<StockEntryDao> {
}
