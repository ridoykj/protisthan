package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.SessionDefaultDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SessionDefaultRepository extends JpaRepository<SessionDefaultDao, String>, JpaSpecificationExecutor<SessionDefaultDao> {
}
