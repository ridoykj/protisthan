package com.itbd.application.db.repos;


import com.itbd.application.db.dao.payments.PaymentOrderReferenceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentOrderReferenceRepository extends JpaRepository<PaymentOrderReferenceDao, String>, JpaSpecificationExecutor<PaymentOrderReferenceDao> {
}
