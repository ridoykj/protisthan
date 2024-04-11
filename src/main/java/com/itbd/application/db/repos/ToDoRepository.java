package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ToDoDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ToDoRepository extends JpaRepository<ToDoDao, String>, JpaSpecificationExecutor<ToDoDao> {
}
