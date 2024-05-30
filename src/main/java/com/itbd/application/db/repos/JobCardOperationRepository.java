package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.jobcard.JobCardOperationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JobCardOperationRepository extends JpaRepository<JobCardOperationDao, String>, JpaSpecificationExecutor<JobCardOperationDao> {
}
