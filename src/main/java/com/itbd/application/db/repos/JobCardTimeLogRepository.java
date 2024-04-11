package com.itbd.application.db.repos;


import com.itbd.application.db.dao.jobcards.JobCardTimeLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JobCardTimeLogRepository extends JpaRepository<JobCardTimeLogDao, String>, JpaSpecificationExecutor<JobCardTimeLogDao> {
}
