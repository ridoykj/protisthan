package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProcessDeferredAccountingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProcessDeferredAccountingRepository extends JpaRepository<ProcessDeferredAccountingDao, String>, JpaSpecificationExecutor<ProcessDeferredAccountingDao> {
}
