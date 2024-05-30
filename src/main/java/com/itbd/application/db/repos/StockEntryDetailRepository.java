package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.stock.StockEntryDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StockEntryDetailRepository extends JpaRepository<StockEntryDetailDao, String>, JpaSpecificationExecutor<StockEntryDetailDao> {
}
