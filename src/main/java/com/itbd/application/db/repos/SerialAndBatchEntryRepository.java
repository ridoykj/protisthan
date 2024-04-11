package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SerialAndBatchEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SerialAndBatchEntryRepository extends JpaRepository<SerialAndBatchEntryDao, String>, JpaSpecificationExecutor<SerialAndBatchEntryDao> {
}
