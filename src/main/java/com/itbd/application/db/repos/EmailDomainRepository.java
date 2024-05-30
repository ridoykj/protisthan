package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.EmailDomainDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailDomainRepository extends JpaRepository<EmailDomainDao, String>, JpaSpecificationExecutor<EmailDomainDao> {
}
