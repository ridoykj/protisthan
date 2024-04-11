package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailUnsubscribeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmailUnsubscribeRepository extends JpaRepository<EmailUnsubscribeDao, String>, JpaSpecificationExecutor<EmailUnsubscribeDao> {
}
