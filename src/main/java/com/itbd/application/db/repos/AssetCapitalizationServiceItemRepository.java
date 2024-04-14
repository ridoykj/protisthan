package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.AssetCapitalizationServiceItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AssetCapitalizationServiceItemRepository extends JpaRepository<AssetCapitalizationServiceItemDao, String>, JpaSpecificationExecutor<AssetCapitalizationServiceItemDao> {
}
