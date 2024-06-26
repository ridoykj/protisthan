package com.itbd.application.db.repos;


import com.itbd.application.db.dao.social.EnergyPointRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EnergyPointRuleRepository extends JpaRepository<EnergyPointRuleDao, String>, JpaSpecificationExecutor<EnergyPointRuleDao> {
}
