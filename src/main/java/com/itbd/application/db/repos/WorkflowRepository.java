package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workflow.WorkflowDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkflowRepository extends JpaRepository<WorkflowDao, String>, JpaSpecificationExecutor<WorkflowDao> {
}
