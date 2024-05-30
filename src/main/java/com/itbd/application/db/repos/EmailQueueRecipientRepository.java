package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.EmailQueueRecipientDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailQueueRecipientRepository extends JpaRepository<EmailQueueRecipientDao, String>, JpaSpecificationExecutor<EmailQueueRecipientDao> {
}
