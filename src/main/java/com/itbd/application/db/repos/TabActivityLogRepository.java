package com.itbd.application.db.repos;


import com.itbd.application.db.dao.activitys.ActivityLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabActivityLogRepository extends JpaRepository<ActivityLogDao, String>, JpaSpecificationExecutor<ActivityLogDao> {
}
