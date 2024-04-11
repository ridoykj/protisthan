package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankTransactionPaymentsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankTransactionPaymentsRepository extends JpaRepository<BankTransactionPaymentsDao, String>, JpaSpecificationExecutor<BankTransactionPaymentsDao> {
}