package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProcessPaymentReconciliationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProcessPaymentReconciliationRepository extends JpaRepository<ProcessPaymentReconciliationDao, String>, JpaSpecificationExecutor<ProcessPaymentReconciliationDao> {
}
