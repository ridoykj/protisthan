package com.itbd.application.db.repos;


import com.itbd.application.db.dao.OverduePaymentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OverduePaymentRepository extends JpaRepository<OverduePaymentDao, String>, JpaSpecificationExecutor<OverduePaymentDao> {
}