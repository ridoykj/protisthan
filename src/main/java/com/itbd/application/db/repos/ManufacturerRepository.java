package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ManufacturerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ManufacturerRepository extends JpaRepository<ManufacturerDao, String>, JpaSpecificationExecutor<ManufacturerDao> {
}
