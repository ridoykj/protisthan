package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomCreatorItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomCreatorItemRepository extends JpaRepository<BomCreatorItemDao, String>, JpaSpecificationExecutor<BomCreatorItemDao> {
}
