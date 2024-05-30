package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.AutoEmailReportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AutoEmailReportRepository extends JpaRepository<AutoEmailReportDao, String>, JpaSpecificationExecutor<AutoEmailReportDao> {
}
