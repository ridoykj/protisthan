package com.itbd.application.db.repos;


import com.itbd.application.db.dao.employee.EmployeeGroupTableDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEmployeeGroupTableRepository extends JpaRepository<EmployeeGroupTableDao, String>, JpaSpecificationExecutor<EmployeeGroupTableDao> {
}
