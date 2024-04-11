package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankTransactionMappingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankTransactionMappingRepository extends JpaRepository<BankTransactionMappingDao, String>, JpaSpecificationExecutor<BankTransactionMappingDao> {
}
