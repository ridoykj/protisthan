package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetCapitalizationStockItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetCapitalizationStockItemRepository extends JpaRepository<AssetCapitalizationStockItemDao, String>, JpaSpecificationExecutor<AssetCapitalizationStockItemDao> {
}
