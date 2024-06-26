package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.DriverDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DriverRepository extends JpaRepository<DriverDao, String>, JpaSpecificationExecutor<DriverDao> {
}
