package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AccountClosingBalanceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AccountClosingBalanceRepository extends JpaRepository<AccountClosingBalanceDao, String>, JpaSpecificationExecutor<AccountClosingBalanceDao> {
}
