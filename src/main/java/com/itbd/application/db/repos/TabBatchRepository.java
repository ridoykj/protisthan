package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BatchDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBatchRepository extends JpaRepository<BatchDao, String>, JpaSpecificationExecutor<BatchDao> {
}
