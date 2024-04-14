package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DependentTaskDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDependentTaskRepository extends JpaRepository<DependentTaskDao, String>, JpaSpecificationExecutor<DependentTaskDao> {
}
