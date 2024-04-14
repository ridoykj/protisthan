package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bom.BomCreatorItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBomCreatorItemRepository extends JpaRepository<BomCreatorItemDao, String>, JpaSpecificationExecutor<BomCreatorItemDao> {
}
