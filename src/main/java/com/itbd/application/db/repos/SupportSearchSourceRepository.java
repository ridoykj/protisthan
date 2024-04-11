package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SupportSearchSourceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupportSearchSourceRepository extends JpaRepository<SupportSearchSourceDao, String>, JpaSpecificationExecutor<SupportSearchSourceDao> {
}
