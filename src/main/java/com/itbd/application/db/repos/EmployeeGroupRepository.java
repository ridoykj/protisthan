package com.itbd.application.db.repos;


import com.itbd.application.db.dao.employee.EmployeeGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmployeeGroupRepository extends JpaRepository<EmployeeGroupDao, String>, JpaSpecificationExecutor<EmployeeGroupDao> {
}
