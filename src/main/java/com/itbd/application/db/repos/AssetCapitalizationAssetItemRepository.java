package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetCapitalizationAssetItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetCapitalizationAssetItemRepository extends JpaRepository<AssetCapitalizationAssetItemDao, String>, JpaSpecificationExecutor<AssetCapitalizationAssetItemDao> {
}
