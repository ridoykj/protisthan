package com.itbd.application.db.repos;


import com.itbd.application.db.dao.activitys.ActivityTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ActivityTypeRepository extends JpaRepository<ActivityTypeDao, String>, JpaSpecificationExecutor<ActivityTypeDao> {
}
