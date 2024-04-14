package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DepartmentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DepartmentRepository extends JpaRepository<DepartmentDao, String>, JpaSpecificationExecutor<DepartmentDao> {
}
