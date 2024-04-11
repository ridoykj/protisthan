package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetRepository extends JpaRepository<AssetDao, String>, JpaSpecificationExecutor<AssetDao> {
}
