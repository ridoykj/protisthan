package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetCategoryRepository extends JpaRepository<AssetCategoryDao, String>, JpaSpecificationExecutor<AssetCategoryDao> {
}
