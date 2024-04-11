package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProcessStatementOfAccountsCustomerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProcessStatementOfAccountsCustomerRepository extends JpaRepository<ProcessStatementOfAccountsCustomerDao, String>, JpaSpecificationExecutor<ProcessStatementOfAccountsCustomerDao> {
}
