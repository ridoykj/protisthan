package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityInspectionParameterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityInspectionParameterRepository extends JpaRepository<QualityInspectionParameterDao, String>, JpaSpecificationExecutor<QualityInspectionParameterDao> {
}
