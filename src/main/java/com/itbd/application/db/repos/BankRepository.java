package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.bank.BankDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BankRepository extends JpaRepository<BankDao, String>, JpaSpecificationExecutor<BankDao> {
}
