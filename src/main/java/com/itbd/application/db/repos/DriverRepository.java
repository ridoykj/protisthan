package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DriverDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDriverRepository extends JpaRepository<DriverDao, String>, JpaSpecificationExecutor<DriverDao> {
}
