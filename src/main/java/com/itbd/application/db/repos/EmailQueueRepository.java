package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.EmailQueueDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailQueueRepository extends JpaRepository<EmailQueueDao, String>, JpaSpecificationExecutor<EmailQueueDao> {
}
