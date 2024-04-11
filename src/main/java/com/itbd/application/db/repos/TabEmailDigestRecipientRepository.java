package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailDigestRecipientDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmailDigestRecipientRepository extends JpaRepository<EmailDigestRecipientDao, String>, JpaSpecificationExecutor<EmailDigestRecipientDao> {
}
