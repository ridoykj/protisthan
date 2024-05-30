package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomUpdateBatchDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomUpdateBatchRepository extends JpaRepository<BomUpdateBatchDao, String>, JpaSpecificationExecutor<BomUpdateBatchDao> {
}
