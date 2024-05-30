package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.payment.PaymentGatewayAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentGatewayAccountRepository extends JpaRepository<PaymentGatewayAccountDao, String>, JpaSpecificationExecutor<PaymentGatewayAccountDao> {
}
