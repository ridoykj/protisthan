package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CashierClosingPaymentsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCashierClosingPaymentsRepository extends JpaRepository<CashierClosingPaymentsDao, String>, JpaSpecificationExecutor<CashierClosingPaymentsDao> {
}
