package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.payment.PaymentTermDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentTermRepository extends JpaRepository<PaymentTermDao, String>, JpaSpecificationExecutor<PaymentTermDao> {
}
