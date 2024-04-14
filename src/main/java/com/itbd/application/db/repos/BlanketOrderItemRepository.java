package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BlanketOrderItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BlanketOrderItemRepository extends JpaRepository<BlanketOrderItemDao, String>, JpaSpecificationExecutor<BlanketOrderItemDao> {
}
