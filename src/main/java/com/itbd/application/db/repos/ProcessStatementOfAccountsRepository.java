package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.process.ProcessStatementOfAccountsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProcessStatementOfAccountsRepository extends JpaRepository<ProcessStatementOfAccountsDao, String>, JpaSpecificationExecutor<ProcessStatementOfAccountsDao> {
}
