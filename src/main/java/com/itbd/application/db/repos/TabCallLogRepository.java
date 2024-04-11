package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CallLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCallLogRepository extends JpaRepository<CallLogDao, String>, JpaSpecificationExecutor<CallLogDao> {
}
