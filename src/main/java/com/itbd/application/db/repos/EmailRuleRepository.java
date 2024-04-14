package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailRuleRepository extends JpaRepository<EmailRuleDao, String>, JpaSpecificationExecutor<EmailRuleDao> {
}
