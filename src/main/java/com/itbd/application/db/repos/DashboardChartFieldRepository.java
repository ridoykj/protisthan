package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.deshboard.DashboardChartFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DashboardChartFieldRepository extends JpaRepository<DashboardChartFieldDao, String>, JpaSpecificationExecutor<DashboardChartFieldDao> {
}
