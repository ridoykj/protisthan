package com.itbd.application.db.repos;


import com.itbd.application.db.dao.documents.DocumentNamingRuleConditionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocumentNamingRuleConditionRepository extends JpaRepository<DocumentNamingRuleConditionDao, String>, JpaSpecificationExecutor<DocumentNamingRuleConditionDao> {
}
