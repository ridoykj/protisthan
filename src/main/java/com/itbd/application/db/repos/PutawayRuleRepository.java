package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.PutawayRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PutawayRuleRepository extends JpaRepository<PutawayRuleDao, String>, JpaSpecificationExecutor<PutawayRuleDao> {
}
