package com.itbd.application.db.repos;


import com.itbd.application.db.dao.price.PricingRuleItemCodeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PricingRuleItemCodeRepository extends JpaRepository<PricingRuleItemCodeDao, String>, JpaSpecificationExecutor<PricingRuleItemCodeDao> {
}
