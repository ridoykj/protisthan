package com.itbd.application.db.repos;


import com.itbd.application.db.dao.UnreconcilePaymentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UnreconcilePaymentRepository extends JpaRepository<UnreconcilePaymentDao, String>, JpaSpecificationExecutor<UnreconcilePaymentDao> {
}
