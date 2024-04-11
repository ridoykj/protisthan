package com.itbd.application.db.repos;


import com.itbd.application.db.dao.tasks.TaskTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaskTypeRepository extends JpaRepository<TaskTypeDao, String>, JpaSpecificationExecutor<TaskTypeDao> {
}
