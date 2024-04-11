package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAccountRepository extends JpaRepository<AccountDao, String>, JpaSpecificationExecutor<AccountDao> {
}
