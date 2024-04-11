package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityFeedbackTemplateParameterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityFeedbackTemplateParameterRepository extends JpaRepository<QualityFeedbackTemplateParameterDao, String>, JpaSpecificationExecutor<QualityFeedbackTemplateParameterDao> {
}
