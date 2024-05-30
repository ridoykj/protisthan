package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.workspace.WorkspaceShortcutDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkspaceShortcutRepository extends JpaRepository<WorkspaceShortcutDao, String>, JpaSpecificationExecutor<WorkspaceShortcutDao> {
}
