package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.jobcard.JobCardItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JobCardItemRepository extends JpaRepository<JobCardItemDao, String>, JpaSpecificationExecutor<JobCardItemDao> {
}
