package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.repost.RepostAccountingLedgerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RepostAccountingLedgerRepository extends JpaRepository<RepostAccountingLedgerDao, String>, JpaSpecificationExecutor<RepostAccountingLedgerDao> {
}
