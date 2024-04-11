package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.ProjectDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProjectRepository extends JpaRepository<ProjectDao, String>, JpaSpecificationExecutor<ProjectDao> {
}
