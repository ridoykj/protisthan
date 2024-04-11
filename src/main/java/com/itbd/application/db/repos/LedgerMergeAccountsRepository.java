package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ledgers.LedgerMergeAccountsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LedgerMergeAccountsRepository extends JpaRepository<LedgerMergeAccountsDao, String>, JpaSpecificationExecutor<LedgerMergeAccountsDao> {
}
