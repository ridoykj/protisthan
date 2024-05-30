package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.account.AccountingDimensionFilterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AccountingDimensionFilterRepository extends JpaRepository<AccountingDimensionFilterDao, String>, JpaSpecificationExecutor<AccountingDimensionFilterDao> {
}
