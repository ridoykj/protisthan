package com.itbd.application.db.repos;


import com.itbd.application.db.dao.jobcards.JobCardDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JobCardRepository extends JpaRepository<JobCardDao, String>, JpaSpecificationExecutor<JobCardDao> {
}
