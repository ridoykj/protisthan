package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.quality_inspection.QualityInspectionParameterGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityInspectionParameterGroupRepository extends JpaRepository<QualityInspectionParameterGroupDao, String>, JpaSpecificationExecutor<QualityInspectionParameterGroupDao> {
}
