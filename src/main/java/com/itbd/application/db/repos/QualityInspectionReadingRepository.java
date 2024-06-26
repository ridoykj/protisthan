package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.quality_inspection.QualityInspectionReadingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityInspectionReadingRepository extends JpaRepository<QualityInspectionReadingDao, String>, JpaSpecificationExecutor<QualityInspectionReadingDao> {
}
