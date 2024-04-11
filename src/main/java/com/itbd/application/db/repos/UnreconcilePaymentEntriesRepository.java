package com.itbd.application.db.repos;


import com.itbd.application.db.dao.UnreconcilePaymentEntriesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UnreconcilePaymentEntriesRepository extends JpaRepository<UnreconcilePaymentEntriesDao, String>, JpaSpecificationExecutor<UnreconcilePaymentEntriesDao> {
}
