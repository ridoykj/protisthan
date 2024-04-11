package com.itbd.application.db.repos;


import com.itbd.application.db.dao.sales.SalesOrderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesOrderRepository extends JpaRepository<SalesOrderDao, String>, JpaSpecificationExecutor<SalesOrderDao> {
}
