package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProcessPaymentReconciliationLogAllocationsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProcessPaymentReconciliationLogAllocationsRepository extends JpaRepository<ProcessPaymentReconciliationLogAllocationsDao, String>, JpaSpecificationExecutor<ProcessPaymentReconciliationLogAllocationsDao> {
}
