package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetShiftFactorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetShiftFactorRepository extends JpaRepository<AssetShiftFactorDao, String>, JpaSpecificationExecutor<AssetShiftFactorDao> {
}
