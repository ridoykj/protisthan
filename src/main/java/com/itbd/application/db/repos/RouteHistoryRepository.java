package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.RouteHistoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RouteHistoryRepository extends JpaRepository<RouteHistoryDao, String>, JpaSpecificationExecutor<RouteHistoryDao> {
}
