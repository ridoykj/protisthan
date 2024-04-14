package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assignments.AssignmentRuleDayDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssignmentRuleDayRepository extends JpaRepository<AssignmentRuleDayDao, String>, JpaSpecificationExecutor<AssignmentRuleDayDao> {
}
