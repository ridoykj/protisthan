package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BrandDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BrandRepository extends JpaRepository<BrandDao, String>, JpaSpecificationExecutor<BrandDao> {
}
