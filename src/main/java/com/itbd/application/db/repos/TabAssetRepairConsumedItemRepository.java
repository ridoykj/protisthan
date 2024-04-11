package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetRepairConsumedItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetRepairConsumedItemRepository extends JpaRepository<AssetRepairConsumedItemDao, String>, JpaSpecificationExecutor<AssetRepairConsumedItemDao> {
}
