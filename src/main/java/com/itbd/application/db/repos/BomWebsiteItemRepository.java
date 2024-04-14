package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bom.BomWebsiteItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomWebsiteItemRepository extends JpaRepository<BomWebsiteItemDao, String>, JpaSpecificationExecutor<BomWebsiteItemDao> {
}
