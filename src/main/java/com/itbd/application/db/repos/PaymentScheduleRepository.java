package com.itbd.application.db.repos;


import com.itbd.application.db.dao.payments.PaymentScheduleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentScheduleRepository extends JpaRepository<PaymentScheduleDao, String>, JpaSpecificationExecutor<PaymentScheduleDao> {
}
