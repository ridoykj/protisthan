package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.payment.PaymentRequestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentRequestRepository extends JpaRepository<PaymentRequestDao, String>, JpaSpecificationExecutor<PaymentRequestDao> {
}
