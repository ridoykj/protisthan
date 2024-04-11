package com.itbd.application.db.repos;


import com.itbd.application.db.dao.payments.PaymentGatewayAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentGatewayAccountRepository extends JpaRepository<PaymentGatewayAccountDao, String>, JpaSpecificationExecutor<PaymentGatewayAccountDao> {
}
