package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workspace.WorkspaceLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkspaceLinkRepository extends JpaRepository<WorkspaceLinkDao, String>, JpaSpecificationExecutor<WorkspaceLinkDao> {
}
