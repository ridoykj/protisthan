package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workflow.WorkflowTransitionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkflowTransitionRepository extends JpaRepository<WorkflowTransitionDao, String>, JpaSpecificationExecutor<WorkflowTransitionDao> {
}
