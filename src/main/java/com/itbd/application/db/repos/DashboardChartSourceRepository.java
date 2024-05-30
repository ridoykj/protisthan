package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.deshboard.DashboardChartSourceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DashboardChartSourceRepository extends JpaRepository<DashboardChartSourceDao, String>, JpaSpecificationExecutor<DashboardChartSourceDao> {
}
