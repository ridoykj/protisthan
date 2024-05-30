package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.RoutingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RoutingRepository extends JpaRepository<RoutingDao, String>, JpaSpecificationExecutor<RoutingDao> {
}
