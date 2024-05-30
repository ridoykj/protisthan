package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.VehicleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface VehicleRepository extends JpaRepository<VehicleDao, String>, JpaSpecificationExecutor<VehicleDao> {
}
