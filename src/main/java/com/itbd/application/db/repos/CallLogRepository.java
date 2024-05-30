package com.itbd.application.db.repos;


import com.itbd.application.db.dao.telephony.CallLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CallLogRepository extends JpaRepository<CallLogDao, String>, JpaSpecificationExecutor<CallLogDao> {
}
