package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DepreciationScheduleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DepreciationScheduleRepository extends JpaRepository<DepreciationScheduleDao, String>, JpaSpecificationExecutor<DepreciationScheduleDao> {
}
