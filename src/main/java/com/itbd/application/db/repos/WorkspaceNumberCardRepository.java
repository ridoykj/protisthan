package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workspace.WorkspaceNumberCardDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkspaceNumberCardRepository extends JpaRepository<WorkspaceNumberCardDao, String>, JpaSpecificationExecutor<WorkspaceNumberCardDao> {
}
