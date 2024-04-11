package com.itbd.application.db.repos;


import com.itbd.application.db.dao.payments.PaymentOrderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentOrderRepository extends JpaRepository<PaymentOrderDao, String>, JpaSpecificationExecutor<PaymentOrderDao> {
}
