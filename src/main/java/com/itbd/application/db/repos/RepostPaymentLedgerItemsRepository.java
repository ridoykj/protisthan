package com.itbd.application.db.repos;


import com.itbd.application.db.dao.reposts.RepostPaymentLedgerItemsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RepostPaymentLedgerItemsRepository extends JpaRepository<RepostPaymentLedgerItemsDao, String>, JpaSpecificationExecutor<RepostPaymentLedgerItemsDao> {
}
