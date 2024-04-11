package com.itbd.application.db.repos;


import com.itbd.application.db.dao.reposts.RepostPaymentLedgerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RepostPaymentLedgerRepository extends JpaRepository<RepostPaymentLedgerDao, String>, JpaSpecificationExecutor<RepostPaymentLedgerDao> {
}