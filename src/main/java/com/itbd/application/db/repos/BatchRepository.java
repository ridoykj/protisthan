package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.BatchDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BatchRepository extends JpaRepository<BatchDao, String>, JpaSpecificationExecutor<BatchDao> {
}
