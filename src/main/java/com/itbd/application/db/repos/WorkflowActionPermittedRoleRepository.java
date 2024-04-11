package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workflow.WorkflowActionPermittedRoleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkflowActionPermittedRoleRepository extends JpaRepository<WorkflowActionPermittedRoleDao, String>, JpaSpecificationExecutor<WorkflowActionPermittedRoleDao> {
}
