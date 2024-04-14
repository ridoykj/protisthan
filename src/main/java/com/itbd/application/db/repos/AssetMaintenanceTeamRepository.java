package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetMaintenanceTeamDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetMaintenanceTeamRepository extends JpaRepository<AssetMaintenanceTeamDao, String>, JpaSpecificationExecutor<AssetMaintenanceTeamDao> {
}
