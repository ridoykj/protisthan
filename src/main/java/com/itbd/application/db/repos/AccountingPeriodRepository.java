package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AccountingPeriodDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AccountingPeriodRepository extends JpaRepository<AccountingPeriodDao, String>, JpaSpecificationExecutor<AccountingPeriodDao> {
}
