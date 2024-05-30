package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityProcedureDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityProcedureRepository extends JpaRepository<QualityProcedureDao, String>, JpaSpecificationExecutor<QualityProcedureDao> {
}
