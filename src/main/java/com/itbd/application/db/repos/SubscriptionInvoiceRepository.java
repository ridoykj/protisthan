package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.subscription.SubscriptionInvoiceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubscriptionInvoiceRepository extends JpaRepository<SubscriptionInvoiceDao, String>, JpaSpecificationExecutor<SubscriptionInvoiceDao> {
}
