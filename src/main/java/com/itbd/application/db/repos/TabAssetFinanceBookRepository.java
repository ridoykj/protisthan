package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetFinanceBookDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAssetFinanceBookRepository extends JpaRepository<AssetFinanceBookDao, String>, JpaSpecificationExecutor<AssetFinanceBookDao> {
}
