package com.itbd.application.db.repos;


import com.itbd.application.db.dao.dashboardchart.DashboardSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DashboardSettingsRepository extends JpaRepository<DashboardSettingsDao, String>, JpaSpecificationExecutor<DashboardSettingsDao> {
}
