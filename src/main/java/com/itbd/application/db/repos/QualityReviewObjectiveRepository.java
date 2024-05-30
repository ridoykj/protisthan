package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityReviewObjectiveDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityReviewObjectiveRepository extends JpaRepository<QualityReviewObjectiveDao, String>, JpaSpecificationExecutor<QualityReviewObjectiveDao> {
}
