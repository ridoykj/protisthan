package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bom.BomWebsiteOperationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBomWebsiteOperationRepository extends JpaRepository<BomWebsiteOperationDao, String>, JpaSpecificationExecutor<BomWebsiteOperationDao> {
}
