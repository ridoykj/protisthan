package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stocks.StockLedgerEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StockLedgerEntryRepository extends JpaRepository<StockLedgerEntryDao, String>, JpaSpecificationExecutor<StockLedgerEntryDao> {
}
