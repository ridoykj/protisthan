package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankAccountSubtypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankAccountSubtypeRepository extends JpaRepository<BankAccountSubtypeDao, String>, JpaSpecificationExecutor<BankAccountSubtypeDao> {
}