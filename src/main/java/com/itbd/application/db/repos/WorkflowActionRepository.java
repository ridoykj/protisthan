package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workflow.WorkflowActionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkflowActionRepository extends JpaRepository<WorkflowActionDao, String>, JpaSpecificationExecutor<WorkflowActionDao> {
}
