package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.EmailGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailGroupRepository extends JpaRepository<EmailGroupDao, String>, JpaSpecificationExecutor<EmailGroupDao> {
}
