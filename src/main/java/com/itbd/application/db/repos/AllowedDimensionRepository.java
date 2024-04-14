package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AllowedDimensionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AllowedDimensionRepository extends JpaRepository<AllowedDimensionDao, String>, JpaSpecificationExecutor<AllowedDimensionDao> {
}
