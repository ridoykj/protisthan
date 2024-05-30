package com.itbd.application.db.repos;


import com.itbd.application.db.dao.selling.sales.SalesOrderItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesOrderItemRepository extends JpaRepository<SalesOrderItemDao, String>, JpaSpecificationExecutor<SalesOrderItemDao> {
}
