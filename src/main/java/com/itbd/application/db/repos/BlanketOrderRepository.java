package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BlanketOrderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBlanketOrderRepository extends JpaRepository<BlanketOrderDao, String>, JpaSpecificationExecutor<BlanketOrderDao> {
}
