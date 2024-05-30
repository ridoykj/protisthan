package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bulk_transaction.BulkTransactionLogDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BulkTransactionLogDetailRepository extends JpaRepository<BulkTransactionLogDetailDao, String>, JpaSpecificationExecutor<BulkTransactionLogDetailDao> {
}
