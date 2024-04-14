package com.itbd.application.db.repos;


import com.itbd.application.db.dao.employee.EmployeeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmployeeRepository extends JpaRepository<EmployeeDao, String>, JpaSpecificationExecutor<EmployeeDao> {
}
