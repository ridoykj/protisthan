package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.subscription.SubscriptionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubscriptionRepository extends JpaRepository<SubscriptionDao, String>, JpaSpecificationExecutor<SubscriptionDao> {
}
