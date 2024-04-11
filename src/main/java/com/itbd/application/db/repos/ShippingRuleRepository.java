package com.itbd.application.db.repos;


import com.itbd.application.db.dao.shipments.ShippingRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShippingRuleRepository extends JpaRepository<ShippingRuleDao, String>, JpaSpecificationExecutor<ShippingRuleDao> {
}
