package com.itbd.application.db.repos;

import com.itbd.application.db.dao.IncomingCallHandlingScheduleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IncomingCallHandlingScheduleRepository extends JpaRepository<IncomingCallHandlingScheduleDao, String>, JpaSpecificationExecutor<IncomingCallHandlingScheduleDao> {
}
