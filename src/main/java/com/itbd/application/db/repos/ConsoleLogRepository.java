package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ConsoleLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ConsoleLogRepository extends JpaRepository<ConsoleLogDao, String>, JpaSpecificationExecutor<ConsoleLogDao> {
}
