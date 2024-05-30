package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.ScheduledJobLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ScheduledJobLogRepository extends JpaRepository<ScheduledJobLogDao, String>, JpaSpecificationExecutor<ScheduledJobLogDao> {
}
