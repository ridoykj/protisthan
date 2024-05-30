package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.account.AccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AccountRepository extends JpaRepository<AccountDao, String>, JpaSpecificationExecutor<AccountDao> {
}
