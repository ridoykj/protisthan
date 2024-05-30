package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.payment.PaymentEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentEntryRepository extends JpaRepository<PaymentEntryDao, String>, JpaSpecificationExecutor<PaymentEntryDao> {
}
