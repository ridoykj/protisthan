package com.itbd.application.db.repos;


import com.itbd.application.db.dao.transactions.TransactionDeletionRecordItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TransactionDeletionRecordItemRepository extends JpaRepository<TransactionDeletionRecordItemDao, String>, JpaSpecificationExecutor<TransactionDeletionRecordItemDao> {
}
