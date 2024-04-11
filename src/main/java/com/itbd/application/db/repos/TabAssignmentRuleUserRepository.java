package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assignments.AssignmentRuleUserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssignmentRuleUserRepository extends JpaRepository<AssignmentRuleUserDao, String>, JpaSpecificationExecutor<AssignmentRuleUserDao> {
}
