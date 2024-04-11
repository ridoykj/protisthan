package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProductBundleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductBundleRepository extends JpaRepository<ProductBundleDao, String>, JpaSpecificationExecutor<ProductBundleDao> {
}
