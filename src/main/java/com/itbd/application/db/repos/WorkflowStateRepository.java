package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workflow.WorkflowStateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkflowStateRepository extends JpaRepository<WorkflowStateDao, String>, JpaSpecificationExecutor<WorkflowStateDao> {
}
