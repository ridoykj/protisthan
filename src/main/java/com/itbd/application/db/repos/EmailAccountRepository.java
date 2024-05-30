package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.EmailAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailAccountRepository extends JpaRepository<EmailAccountDao, String>, JpaSpecificationExecutor<EmailAccountDao> {
}
