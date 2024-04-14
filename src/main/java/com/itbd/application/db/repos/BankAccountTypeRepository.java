package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankAccountTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankAccountTypeRepository extends JpaRepository<BankAccountTypeDao, String>, JpaSpecificationExecutor<BankAccountTypeDao> {
}
