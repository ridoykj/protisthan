package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workflow.WorkflowDocumentStateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkflowDocumentStateRepository extends JpaRepository<WorkflowDocumentStateDao, String>, JpaSpecificationExecutor<WorkflowDocumentStateDao> {
}
