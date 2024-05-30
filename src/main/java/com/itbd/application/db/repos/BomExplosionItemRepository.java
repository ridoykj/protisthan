package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomExplosionItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomExplosionItemRepository extends JpaRepository<BomExplosionItemDao, String>, JpaSpecificationExecutor<BomExplosionItemDao> {
}
