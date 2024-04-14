package com.itbd.application.db.repos;


import com.itbd.application.db.dao.currencys.CurrencyExchangeSettingsResultDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CurrencyExchangeSettingsResultRepository extends JpaRepository<CurrencyExchangeSettingsResultDao, String>, JpaSpecificationExecutor<CurrencyExchangeSettingsResultDao> {
}
