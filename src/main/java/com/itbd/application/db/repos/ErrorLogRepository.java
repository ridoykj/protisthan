package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.ErrorLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ErrorLogRepository extends JpaRepository<ErrorLogDao, String>, JpaSpecificationExecutor<ErrorLogDao> {
}
