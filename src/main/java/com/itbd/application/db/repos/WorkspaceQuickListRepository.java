package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.workspace.WorkspaceQuickListDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkspaceQuickListRepository extends JpaRepository<WorkspaceQuickListDao, String>, JpaSpecificationExecutor<WorkspaceQuickListDao> {
}
