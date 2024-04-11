package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SessionsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SessionsRepository extends JpaRepository<SessionsDao, String>, JpaSpecificationExecutor<SessionsDao> {
}
