package com.itbd.application.db.repos;


import com.itbd.application.db.dao.documents.DocumentNamingRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocumentNamingRuleRepository extends JpaRepository<DocumentNamingRuleDao, String>, JpaSpecificationExecutor<DocumentNamingRuleDao> {
}
