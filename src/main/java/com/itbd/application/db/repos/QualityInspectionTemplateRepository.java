package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.quality_inspection.QualityInspectionTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityInspectionTemplateRepository extends JpaRepository<QualityInspectionTemplateDao, String>, JpaSpecificationExecutor<QualityInspectionTemplateDao> {
}
