package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.ProjectTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProjectTypeRepository extends JpaRepository<ProjectTypeDao, String>, JpaSpecificationExecutor<ProjectTypeDao> {
}
