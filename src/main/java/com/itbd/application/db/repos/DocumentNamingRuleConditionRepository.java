package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.DocumentNamingRuleConditionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocumentNamingRuleConditionRepository extends JpaRepository<DocumentNamingRuleConditionDao, String>, JpaSpecificationExecutor<DocumentNamingRuleConditionDao> {
}
