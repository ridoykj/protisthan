package com.itbd.application.db.repos;


import com.itbd.application.db.dao.projects.timesheet.TimesheetDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TimesheetDetailRepository extends JpaRepository<TimesheetDetailDao, String>, JpaSpecificationExecutor<TimesheetDetailDao> {
}
