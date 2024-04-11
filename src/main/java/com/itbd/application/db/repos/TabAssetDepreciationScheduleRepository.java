package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetDepreciationScheduleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetDepreciationScheduleRepository extends JpaRepository<AssetDepreciationScheduleDao, String>, JpaSpecificationExecutor<AssetDepreciationScheduleDao> {
}
