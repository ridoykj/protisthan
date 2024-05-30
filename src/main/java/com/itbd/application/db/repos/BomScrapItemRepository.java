package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomScrapItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomScrapItemRepository extends JpaRepository<BomScrapItemDao, String>, JpaSpecificationExecutor<BomScrapItemDao> {
}
