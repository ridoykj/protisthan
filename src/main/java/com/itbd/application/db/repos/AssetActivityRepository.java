package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetActivityDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetActivityRepository extends JpaRepository<AssetActivityDao, String>, JpaSpecificationExecutor<AssetActivityDao> {
}
