package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityFeedbackTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityFeedbackTemplateRepository extends JpaRepository<QualityFeedbackTemplateDao, String>, JpaSpecificationExecutor<QualityFeedbackTemplateDao> {
}
