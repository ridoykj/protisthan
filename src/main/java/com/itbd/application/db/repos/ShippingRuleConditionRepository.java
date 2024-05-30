package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.shipping.ShippingRuleConditionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShippingRuleConditionRepository extends JpaRepository<ShippingRuleConditionDao, String>, JpaSpecificationExecutor<ShippingRuleConditionDao> {
}
