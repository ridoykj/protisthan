package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.PreparedReportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PreparedReportRepository extends JpaRepository<PreparedReportDao, String>, JpaSpecificationExecutor<PreparedReportDao> {
}
