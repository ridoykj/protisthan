package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.project.ProjectUserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProjectUserRepository extends JpaRepository<ProjectUserDao, String>, JpaSpecificationExecutor<ProjectUserDao> {
}
