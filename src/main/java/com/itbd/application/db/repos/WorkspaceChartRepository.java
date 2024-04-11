package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workspace.WorkspaceChartDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkspaceChartRepository extends JpaRepository<WorkspaceChartDao, String>, JpaSpecificationExecutor<WorkspaceChartDao> {
}
