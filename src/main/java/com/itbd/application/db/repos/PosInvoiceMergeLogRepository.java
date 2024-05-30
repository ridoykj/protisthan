package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosInvoiceMergeLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosInvoiceMergeLogRepository extends JpaRepository<PosInvoiceMergeLogDao, String>, JpaSpecificationExecutor<PosInvoiceMergeLogDao> {
}
