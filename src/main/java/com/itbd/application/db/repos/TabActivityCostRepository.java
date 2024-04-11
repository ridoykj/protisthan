package com.itbd.application.db.repos;


import com.itbd.application.db.dao.activitys.ActivityCostDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabActivityCostRepository extends JpaRepository<ActivityCostDao, String>, JpaSpecificationExecutor<ActivityCostDao> {
}
