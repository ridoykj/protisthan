package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AccountingDimensionDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAccountingDimensionDetailRepository extends JpaRepository<AccountingDimensionDetailDao, String>, JpaSpecificationExecutor<AccountingDimensionDetailDao> {
}
