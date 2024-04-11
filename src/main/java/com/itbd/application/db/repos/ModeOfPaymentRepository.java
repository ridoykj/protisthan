package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ModeOfPaymentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ModeOfPaymentRepository extends JpaRepository<ModeOfPaymentDao, String>, JpaSpecificationExecutor<ModeOfPaymentDao> {
}
