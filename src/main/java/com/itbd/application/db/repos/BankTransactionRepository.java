package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankTransactionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankTransactionRepository extends JpaRepository<BankTransactionDao, String>, JpaSpecificationExecutor<BankTransactionDao> {
}
