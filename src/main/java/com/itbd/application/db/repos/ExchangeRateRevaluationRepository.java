package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ExchangeRateRevaluationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ExchangeRateRevaluationRepository extends JpaRepository<ExchangeRateRevaluationDao, String>, JpaSpecificationExecutor<ExchangeRateRevaluationDao> {
}
