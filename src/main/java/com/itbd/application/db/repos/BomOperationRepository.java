package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomOperationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomOperationRepository extends JpaRepository<BomOperationDao, String>, JpaSpecificationExecutor<BomOperationDao> {
}
