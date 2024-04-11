package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmailGroupRepository extends JpaRepository<EmailGroupDao, String>, JpaSpecificationExecutor<EmailGroupDao> {
}
