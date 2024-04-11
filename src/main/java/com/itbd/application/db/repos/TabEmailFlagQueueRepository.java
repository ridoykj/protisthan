package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailFlagQueueDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmailFlagQueueRepository extends JpaRepository<EmailFlagQueueDao, String>, JpaSpecificationExecutor<EmailFlagQueueDao> {
}
