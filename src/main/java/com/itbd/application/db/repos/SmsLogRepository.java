package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SmsLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SmsLogRepository extends JpaRepository<SmsLogDao, String>, JpaSpecificationExecutor<SmsLogDao> {
}
