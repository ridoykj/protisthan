package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.subscription.SubscriptionPlanDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubscriptionPlanRepository extends JpaRepository<SubscriptionPlanDao, String>, JpaSpecificationExecutor<SubscriptionPlanDao> {
}
