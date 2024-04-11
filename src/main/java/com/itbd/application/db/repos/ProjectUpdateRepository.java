package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.ProjectUpdateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProjectUpdateRepository extends JpaRepository<ProjectUpdateDao, String>, JpaSpecificationExecutor<ProjectUpdateDao> {
}
