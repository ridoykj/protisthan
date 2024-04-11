package com.itbd.application.db.repos;


import com.itbd.application.db.dao.employee.EmployeeEducationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmployeeEducationRepository extends JpaRepository<EmployeeEducationDao, String>, JpaSpecificationExecutor<EmployeeEducationDao> {
}
