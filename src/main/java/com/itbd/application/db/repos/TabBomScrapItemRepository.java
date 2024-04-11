package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bom.BomScrapItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBomScrapItemRepository extends JpaRepository<BomScrapItemDao, String>, JpaSpecificationExecutor<BomScrapItemDao> {
}