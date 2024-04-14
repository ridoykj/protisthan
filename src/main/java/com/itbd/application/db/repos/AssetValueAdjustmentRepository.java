package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetValueAdjustmentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetValueAdjustmentRepository extends JpaRepository<AssetValueAdjustmentDao, String>, JpaSpecificationExecutor<AssetValueAdjustmentDao> {
}
