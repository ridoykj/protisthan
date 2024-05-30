package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityActionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityActionRepository extends JpaRepository<QualityActionDao, String>, JpaSpecificationExecutor<QualityActionDao> {
}
