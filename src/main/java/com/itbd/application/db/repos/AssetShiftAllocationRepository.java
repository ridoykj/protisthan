package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetShiftAllocationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetShiftAllocationRepository extends JpaRepository<AssetShiftAllocationDao, String>, JpaSpecificationExecutor<AssetShiftAllocationDao> {
}
