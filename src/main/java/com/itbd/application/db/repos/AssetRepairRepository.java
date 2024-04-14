package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetRepairDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetRepairRepository extends JpaRepository<AssetRepairDao, String>, JpaSpecificationExecutor<AssetRepairDao> {
}
