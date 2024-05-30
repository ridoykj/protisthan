package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityGoalDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityGoalRepository extends JpaRepository<QualityGoalDao, String>, JpaSpecificationExecutor<QualityGoalDao> {
}
