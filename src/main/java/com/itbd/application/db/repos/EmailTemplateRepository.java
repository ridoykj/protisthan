package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailTemplateRepository extends JpaRepository<EmailTemplateDao, String>, JpaSpecificationExecutor<EmailTemplateDao> {
}
