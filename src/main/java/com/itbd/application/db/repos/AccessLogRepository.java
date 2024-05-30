package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.AccessLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AccessLogRepository extends JpaRepository<AccessLogDao, String>, JpaSpecificationExecutor<AccessLogDao> {
}
