package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomWebsiteOperationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomWebsiteOperationRepository extends JpaRepository<BomWebsiteOperationDao, String>, JpaSpecificationExecutor<BomWebsiteOperationDao> {
}
