package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityFeedbackParameterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityFeedbackParameterRepository extends JpaRepository<QualityFeedbackParameterDao, String>, JpaSpecificationExecutor<QualityFeedbackParameterDao> {
}