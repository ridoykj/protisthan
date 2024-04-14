package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetMaintenanceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetMaintenanceRepository extends JpaRepository<AssetMaintenanceDao, String>, JpaSpecificationExecutor<AssetMaintenanceDao> {
}
