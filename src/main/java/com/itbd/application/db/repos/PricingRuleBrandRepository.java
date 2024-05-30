package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pricing.PricingRuleBrandDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PricingRuleBrandRepository extends JpaRepository<PricingRuleBrandDao, String>, JpaSpecificationExecutor<PricingRuleBrandDao> {
}
