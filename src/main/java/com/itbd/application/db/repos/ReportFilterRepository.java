package com.itbd.application.db.repos;


import com.itbd.application.db.dao.reports.ReportFilterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ReportFilterRepository extends JpaRepository<ReportFilterDao, String>, JpaSpecificationExecutor<ReportFilterDao> {
}
