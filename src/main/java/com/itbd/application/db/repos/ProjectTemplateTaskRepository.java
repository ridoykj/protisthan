package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.project.ProjectTemplateTaskDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProjectTemplateTaskRepository extends JpaRepository<ProjectTemplateTaskDao, String>, JpaSpecificationExecutor<ProjectTemplateTaskDao> {
}
