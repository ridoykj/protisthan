package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.ScheduledJobTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ScheduledJobTypeRepository extends JpaRepository<ScheduledJobTypeDao, String>, JpaSpecificationExecutor<ScheduledJobTypeDao> {
}
