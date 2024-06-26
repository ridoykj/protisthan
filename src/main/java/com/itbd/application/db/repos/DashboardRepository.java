package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.deshboard.DashboardDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DashboardRepository extends JpaRepository<DashboardDao, String>, JpaSpecificationExecutor<DashboardDao> {
}
