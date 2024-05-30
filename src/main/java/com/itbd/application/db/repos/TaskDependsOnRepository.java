package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.task.TaskDependsOnDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaskDependsOnRepository extends JpaRepository<TaskDependsOnDao, String>, JpaSpecificationExecutor<TaskDependsOnDao> {
}
