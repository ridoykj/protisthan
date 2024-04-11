package com.itbd.application.db.repos;


import com.itbd.application.db.dao.jobcards.JobCardScrapItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JobCardScrapItemRepository extends JpaRepository<JobCardScrapItemDao, String>, JpaSpecificationExecutor<JobCardScrapItemDao> {
}
