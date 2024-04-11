package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SubmissionQueueDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubmissionQueueRepository extends JpaRepository<SubmissionQueueDao, String>, JpaSpecificationExecutor<SubmissionQueueDao> {
}
