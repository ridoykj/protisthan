package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.stock.StockEntryTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StockEntryTypeRepository extends JpaRepository<StockEntryTypeDao, String>, JpaSpecificationExecutor<StockEntryTypeDao> {
}
