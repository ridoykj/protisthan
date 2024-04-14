package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankAccountRepository extends JpaRepository<BankAccountDao, String>, JpaSpecificationExecutor<BankAccountDao> {
}
