package com.itbd.application.db.repos;


import com.itbd.application.db.dao.emails.EmailDigestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmailDigestRepository extends JpaRepository<EmailDigestDao, String>, JpaSpecificationExecutor<EmailDigestDao> {
}
