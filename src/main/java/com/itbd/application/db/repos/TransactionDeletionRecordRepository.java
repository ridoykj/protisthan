package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.TransactionDeletionRecordDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TransactionDeletionRecordRepository extends JpaRepository<TransactionDeletionRecordDao, String>, JpaSpecificationExecutor<TransactionDeletionRecordDao> {
}
