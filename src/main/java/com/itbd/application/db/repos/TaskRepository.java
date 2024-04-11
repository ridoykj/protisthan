package com.itbd.application.db.repos;


import com.itbd.application.db.dao.tasks.TaskDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaskRepository extends JpaRepository<TaskDao, String>, JpaSpecificationExecutor<TaskDao> {
}
