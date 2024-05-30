package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.task.TaskTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaskTypeRepository extends JpaRepository<TaskTypeDao, String>, JpaSpecificationExecutor<TaskTypeDao> {
}
