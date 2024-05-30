package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.email.EmailDigestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailDigestRepository extends JpaRepository<EmailDigestDao, String>, JpaSpecificationExecutor<EmailDigestDao> {
}
