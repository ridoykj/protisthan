package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProcessSubscriptionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProcessSubscriptionRepository extends JpaRepository<ProcessSubscriptionDao, String>, JpaSpecificationExecutor<ProcessSubscriptionDao> {
}
