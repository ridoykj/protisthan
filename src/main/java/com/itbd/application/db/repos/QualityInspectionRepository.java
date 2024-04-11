package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityInspectionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityInspectionRepository extends JpaRepository<QualityInspectionDao, String>, JpaSpecificationExecutor<QualityInspectionDao> {
}
