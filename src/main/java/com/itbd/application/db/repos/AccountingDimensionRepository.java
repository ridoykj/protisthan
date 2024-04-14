package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AccountingDimensionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAccountingDimensionRepository extends JpaRepository<AccountingDimensionDao, String>, JpaSpecificationExecutor<AccountingDimensionDao> {
}
