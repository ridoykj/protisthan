package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AutoEmailReportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAutoEmailReportRepository extends JpaRepository<AutoEmailReportDao, String>, JpaSpecificationExecutor<AutoEmailReportDao> {
}
