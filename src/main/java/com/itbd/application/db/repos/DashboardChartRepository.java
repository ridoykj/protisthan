package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.deshboard.DashboardChartDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DashboardChartRepository extends JpaRepository<DashboardChartDao, String>, JpaSpecificationExecutor<DashboardChartDao> {
}
