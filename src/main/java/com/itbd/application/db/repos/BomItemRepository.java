package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomItemRepository extends JpaRepository<BomItemDao, String>, JpaSpecificationExecutor<BomItemDao> {
}
