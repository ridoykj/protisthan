package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.workspace.WorkspaceCustomBlockDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkspaceCustomBlockRepository extends JpaRepository<WorkspaceCustomBlockDao, String>, JpaSpecificationExecutor<WorkspaceCustomBlockDao> {
}
