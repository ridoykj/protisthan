package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.email.EmailDigestRecipientDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailDigestRecipientRepository extends JpaRepository<EmailDigestRecipientDao, String>, JpaSpecificationExecutor<EmailDigestRecipientDao> {
}
