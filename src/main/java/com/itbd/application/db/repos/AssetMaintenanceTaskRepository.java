package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetMaintenanceTaskDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetMaintenanceTaskRepository extends JpaRepository<AssetMaintenanceTaskDao, String>, JpaSpecificationExecutor<AssetMaintenanceTaskDao> {
}
