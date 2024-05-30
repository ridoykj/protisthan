package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.payment.PaymentLedgerEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentLedgerEntryRepository extends JpaRepository<PaymentLedgerEntryDao, String>, JpaSpecificationExecutor<PaymentLedgerEntryDao> {
}
