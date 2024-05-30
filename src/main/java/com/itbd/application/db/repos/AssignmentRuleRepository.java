package com.itbd.application.db.repos;


import com.itbd.application.db.dao.automation.AssignmentRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssignmentRuleRepository extends JpaRepository<AssignmentRuleDao, String>, JpaSpecificationExecutor<AssignmentRuleDao> {
}
