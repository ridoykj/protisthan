package com.itbd.application.db.repos;


import com.itbd.application.db.dao.TimesheetDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TimesheetRepository extends JpaRepository<TimesheetDao, String>, JpaSpecificationExecutor<TimesheetDao> {
}
