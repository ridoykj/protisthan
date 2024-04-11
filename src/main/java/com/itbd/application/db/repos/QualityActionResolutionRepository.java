package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityActionResolutionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityActionResolutionRepository extends JpaRepository<QualityActionResolutionDao, String>, JpaSpecificationExecutor<QualityActionResolutionDao> {
}
