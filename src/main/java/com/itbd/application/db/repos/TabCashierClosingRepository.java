package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CashierClosingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCashierClosingRepository extends JpaRepository<CashierClosingDao, String>, JpaSpecificationExecutor<CashierClosingDao> {
}
