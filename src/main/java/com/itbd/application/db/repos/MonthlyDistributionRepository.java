package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.MonthlyDistributionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MonthlyDistributionRepository extends JpaRepository<MonthlyDistributionDao, String>, JpaSpecificationExecutor<MonthlyDistributionDao> {
}
