package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.repost.RepostAccountingLedgerItemsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RepostAccountingLedgerItemsRepository extends JpaRepository<RepostAccountingLedgerItemsDao, String>, JpaSpecificationExecutor<RepostAccountingLedgerItemsDao> {
}
