package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BulkTransactionLogDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBulkTransactionLogDetailRepository extends JpaRepository<BulkTransactionLogDetailDao, String>, JpaSpecificationExecutor<BulkTransactionLogDetailDao> {
}
