package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.employee.EmployeeGroupTableDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmployeeGroupTableRepository extends JpaRepository<EmployeeGroupTableDao, String>, JpaSpecificationExecutor<EmployeeGroupTableDao> {
}
