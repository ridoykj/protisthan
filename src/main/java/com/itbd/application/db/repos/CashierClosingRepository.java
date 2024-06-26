package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.CashierClosingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CashierClosingRepository extends JpaRepository<CashierClosingDao, String>, JpaSpecificationExecutor<CashierClosingDao> {
}
