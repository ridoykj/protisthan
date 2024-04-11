package com.itbd.application.db.repos;


import com.itbd.application.db.dao.shipments.ShippingRuleCountryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShippingRuleCountryRepository extends JpaRepository<ShippingRuleCountryDao, String>, JpaSpecificationExecutor<ShippingRuleCountryDao> {
}
