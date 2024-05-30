package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.payment.PaymentEntryDeductionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentEntryDeductionRepository extends JpaRepository<PaymentEntryDeductionDao, String>, JpaSpecificationExecutor<PaymentEntryDeductionDao> {
}
