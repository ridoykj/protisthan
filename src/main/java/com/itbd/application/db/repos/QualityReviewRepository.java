package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityReviewDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityReviewRepository extends JpaRepository<QualityReviewDao, String>, JpaSpecificationExecutor<QualityReviewDao> {
}
