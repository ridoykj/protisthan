package com.itbd.application.db.repos;


import com.itbd.application.db.dao.price.PricingRuleDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PricingRuleDetailRepository extends JpaRepository<PricingRuleDetailDao, String>, JpaSpecificationExecutor<PricingRuleDetailDao> {
}
