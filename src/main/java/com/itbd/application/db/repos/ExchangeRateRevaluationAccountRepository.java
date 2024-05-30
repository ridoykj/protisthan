package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ExchangeRateRevaluationAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ExchangeRateRevaluationAccountRepository extends JpaRepository<ExchangeRateRevaluationAccountDao, String>, JpaSpecificationExecutor<ExchangeRateRevaluationAccountDao> {
}
