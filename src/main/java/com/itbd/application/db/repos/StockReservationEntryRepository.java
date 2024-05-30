package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.stock.StockReservationEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StockReservationEntryRepository extends JpaRepository<StockReservationEntryDao, String>, JpaSpecificationExecutor<StockReservationEntryDao> {
}
