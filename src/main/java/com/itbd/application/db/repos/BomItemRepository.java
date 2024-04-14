package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bom.BomItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBomItemRepository extends JpaRepository<BomItemDao, String>, JpaSpecificationExecutor<BomItemDao> {
}
