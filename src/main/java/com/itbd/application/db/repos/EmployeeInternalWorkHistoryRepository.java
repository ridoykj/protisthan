package com.itbd.application.db.repos;


import com.itbd.application.db.dao.employee.EmployeeInternalWorkHistoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmployeeInternalWorkHistoryRepository extends JpaRepository<EmployeeInternalWorkHistoryDao, String>, JpaSpecificationExecutor<EmployeeInternalWorkHistoryDao> {
}
