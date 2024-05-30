package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.LedgerMergeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LedgerMergeRepository extends JpaRepository<LedgerMergeDao, String>, JpaSpecificationExecutor<LedgerMergeDao> {
}
