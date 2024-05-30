package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.deshboard.DashboardChartLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DashboardChartLinkRepository extends JpaRepository<DashboardChartLinkDao, String>, JpaSpecificationExecutor<DashboardChartLinkDao> {
}
