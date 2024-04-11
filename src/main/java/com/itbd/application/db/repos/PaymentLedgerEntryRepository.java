package com.itbd.application.db.repos;


import com.itbd.application.db.dao.payments.PaymentLedgerEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentLedgerEntryRepository extends JpaRepository<PaymentLedgerEntryDao, String>, JpaSpecificationExecutor<PaymentLedgerEntryDao> {
}
