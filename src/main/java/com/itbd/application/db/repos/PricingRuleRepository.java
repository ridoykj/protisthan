package com.itbd.application.db.repos;


import com.itbd.application.db.dao.price.PricingRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PricingRuleRepository extends JpaRepository<PricingRuleDao, String>, JpaSpecificationExecutor<PricingRuleDao> {
}
