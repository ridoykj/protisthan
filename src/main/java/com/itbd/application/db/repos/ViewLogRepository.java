package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ViewLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ViewLogRepository extends JpaRepository<ViewLogDao, String>, JpaSpecificationExecutor<ViewLogDao> {
}
