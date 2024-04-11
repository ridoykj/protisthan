package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workspace.WorkspaceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkspaceRepository extends JpaRepository<WorkspaceDao, String>, JpaSpecificationExecutor<WorkspaceDao> {
}
