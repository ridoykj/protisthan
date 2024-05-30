package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.PlantFloorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PlantFloorRepository extends JpaRepository<PlantFloorDao, String>, JpaSpecificationExecutor<PlantFloorDao> {
}
