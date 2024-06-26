package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.ActivityLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ActivityLogRepository extends JpaRepository<ActivityLogDao, String>, JpaSpecificationExecutor<ActivityLogDao> {
}
