package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailDomainDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmailDomainRepository extends JpaRepository<EmailDomainDao, String>, JpaSpecificationExecutor<EmailDomainDao> {
}
