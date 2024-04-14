package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetMovementItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetMovementItemRepository extends JpaRepository<AssetMovementItemDao, String>, JpaSpecificationExecutor<AssetMovementItemDao> {
}
