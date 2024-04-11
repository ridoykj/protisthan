package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetCapitalizationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetCapitalizationRepository extends JpaRepository<AssetCapitalizationDao, String>, JpaSpecificationExecutor<AssetCapitalizationDao> {
}
