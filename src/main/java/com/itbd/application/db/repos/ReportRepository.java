package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.ReportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ReportRepository extends JpaRepository<ReportDao, String>, JpaSpecificationExecutor<ReportDao> {
}
