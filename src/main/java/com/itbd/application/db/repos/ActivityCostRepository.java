package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.ActivityCostDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ActivityCostRepository extends JpaRepository<ActivityCostDao, String>, JpaSpecificationExecutor<ActivityCostDao> {
}
