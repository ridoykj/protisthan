package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AccountingDimensionFilterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AccountingDimensionFilterRepository extends JpaRepository<AccountingDimensionFilterDao, String>, JpaSpecificationExecutor<AccountingDimensionFilterDao> {
}
