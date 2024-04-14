package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetMovementDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetMovementRepository extends JpaRepository<AssetMovementDao, String>, JpaSpecificationExecutor<AssetMovementDao> {
}
