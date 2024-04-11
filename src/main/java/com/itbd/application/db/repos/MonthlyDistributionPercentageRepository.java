package com.itbd.application.db.repos;


import com.itbd.application.db.dao.MonthlyDistributionPercentageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MonthlyDistributionPercentageRepository extends JpaRepository<MonthlyDistributionPercentageDao, String>, JpaSpecificationExecutor<MonthlyDistributionPercentageDao> {
}
