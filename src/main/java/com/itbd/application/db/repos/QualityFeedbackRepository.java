package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityFeedbackDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityFeedbackRepository extends JpaRepository<QualityFeedbackDao, String>, JpaSpecificationExecutor<QualityFeedbackDao> {
}
