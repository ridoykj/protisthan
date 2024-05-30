package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.process.ProcessPaymentReconciliationLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProcessPaymentReconciliationLogRepository extends JpaRepository<ProcessPaymentReconciliationLogDao, String>, JpaSpecificationExecutor<ProcessPaymentReconciliationLogDao> {
}
