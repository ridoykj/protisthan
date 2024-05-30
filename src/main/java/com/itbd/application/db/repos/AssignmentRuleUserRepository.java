package com.itbd.application.db.repos;


import com.itbd.application.db.dao.automation.AssignmentRuleUserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssignmentRuleUserRepository extends JpaRepository<AssignmentRuleUserDao, String>, JpaSpecificationExecutor<AssignmentRuleUserDao> {
}
