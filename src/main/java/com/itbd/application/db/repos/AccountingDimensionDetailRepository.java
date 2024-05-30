package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.account.AccountingDimensionDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AccountingDimensionDetailRepository extends JpaRepository<AccountingDimensionDetailDao, String>, JpaSpecificationExecutor<AccountingDimensionDetailDao> {
}
