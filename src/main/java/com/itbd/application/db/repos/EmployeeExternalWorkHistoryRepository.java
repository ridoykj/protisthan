package com.itbd.application.db.repos;


import com.itbd.application.db.dao.employee.EmployeeExternalWorkHistoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmployeeExternalWorkHistoryRepository extends JpaRepository<EmployeeExternalWorkHistoryDao, String>, JpaSpecificationExecutor<EmployeeExternalWorkHistoryDao> {
}
