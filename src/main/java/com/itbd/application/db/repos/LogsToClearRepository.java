package com.itbd.application.db.repos;


import com.itbd.application.db.dao.LogsToClearDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LogsToClearRepository extends JpaRepository<LogsToClearDao, String>, JpaSpecificationExecutor<LogsToClearDao> {
}
