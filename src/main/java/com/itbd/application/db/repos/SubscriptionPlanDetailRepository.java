package com.itbd.application.db.repos;


import com.itbd.application.db.dao.subscription.SubscriptionPlanDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubscriptionPlanDetailRepository extends JpaRepository<SubscriptionPlanDetailDao, String>, JpaSpecificationExecutor<SubscriptionPlanDetailDao> {
}
