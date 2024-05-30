package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityProcedureProcessDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityProcedureProcessRepository extends JpaRepository<QualityProcedureProcessDao, String>, JpaSpecificationExecutor<QualityProcedureProcessDao> {
}
