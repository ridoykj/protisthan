package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityGoalObjectiveDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityGoalObjectiveRepository extends JpaRepository<QualityGoalObjectiveDao, String>, JpaSpecificationExecutor<QualityGoalObjectiveDao> {
}
