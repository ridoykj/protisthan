package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workflow.WorkflowActionMasterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkflowActionMasterRepository extends JpaRepository<WorkflowActionMasterDao, String>, JpaSpecificationExecutor<WorkflowActionMasterDao> {
}
