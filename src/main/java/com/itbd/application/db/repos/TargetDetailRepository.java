package com.itbd.application.db.repos;


import com.itbd.application.db.dao.TargetDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TargetDetailRepository extends JpaRepository<TargetDetailDao, String>, JpaSpecificationExecutor<TargetDetailDao> {
}
