package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetCategoryAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetCategoryAccountRepository extends JpaRepository<AssetCategoryAccountDao, String>, JpaSpecificationExecutor<AssetCategoryAccountDao> {
}
