package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankStatementImportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BankStatementImportRepository extends JpaRepository<BankStatementImportDao, String>, JpaSpecificationExecutor<BankStatementImportDao> {
}
