package com.itbd.application.db.repos;


import com.itbd.application.db.dao.reports.ReportColumnDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ReportColumnRepository extends JpaRepository<ReportColumnDao, String>, JpaSpecificationExecutor<ReportColumnDao> {
}
