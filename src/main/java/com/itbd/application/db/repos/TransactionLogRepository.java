package com.itbd.application.db.repos;


import com.itbd.application.db.dao.transactions.TransactionLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TransactionLogRepository extends JpaRepository<TransactionLogDao, String>, JpaSpecificationExecutor<TransactionLogDao> {
}
