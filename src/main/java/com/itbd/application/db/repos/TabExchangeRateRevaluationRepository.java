package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ExchangeRateRevaluationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabExchangeRateRevaluationRepository extends JpaRepository<ExchangeRateRevaluationDao, String>, JpaSpecificationExecutor<ExchangeRateRevaluationDao> {
}
