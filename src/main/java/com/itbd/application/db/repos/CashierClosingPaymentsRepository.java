package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.CashierClosingPaymentsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CashierClosingPaymentsRepository extends JpaRepository<CashierClosingPaymentsDao, String>, JpaSpecificationExecutor<CashierClosingPaymentsDao> {
}
