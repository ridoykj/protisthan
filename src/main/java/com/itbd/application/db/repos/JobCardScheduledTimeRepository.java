package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.jobcard.JobCardScheduledTimeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JobCardScheduledTimeRepository extends JpaRepository<JobCardScheduledTimeDao, String>, JpaSpecificationExecutor<JobCardScheduledTimeDao> {
}
