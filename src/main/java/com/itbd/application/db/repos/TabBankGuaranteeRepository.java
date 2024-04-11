package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankGuaranteeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBankGuaranteeRepository extends JpaRepository<BankGuaranteeDao, String>, JpaSpecificationExecutor<BankGuaranteeDao> {
}
