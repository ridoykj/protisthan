package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetMaintenanceLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetMaintenanceLogRepository extends JpaRepository<AssetMaintenanceLogDao, String>, JpaSpecificationExecutor<AssetMaintenanceLogDao> {
}
