package com.itbd.application.db.repos;


import com.itbd.application.db.dao.payments.PaymentEntryReferenceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentEntryReferenceRepository extends JpaRepository<PaymentEntryReferenceDao, String>, JpaSpecificationExecutor<PaymentEntryReferenceDao> {
}
