package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.BlanketOrderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BlanketOrderRepository extends JpaRepository<BlanketOrderDao, String>, JpaSpecificationExecutor<BlanketOrderDao> {
}
