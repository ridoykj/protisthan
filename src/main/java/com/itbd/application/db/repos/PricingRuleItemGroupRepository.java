package com.itbd.application.db.repos;


import com.itbd.application.db.dao.price.PricingRuleItemGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PricingRuleItemGroupRepository extends JpaRepository<PricingRuleItemGroupDao, String>, JpaSpecificationExecutor<PricingRuleItemGroupDao> {
}
