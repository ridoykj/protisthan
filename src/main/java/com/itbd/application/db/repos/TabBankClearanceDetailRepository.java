package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankClearanceDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankClearanceDetailRepository extends JpaRepository<BankClearanceDetailDao, String>, JpaSpecificationExecutor<BankClearanceDetailDao> {
}
