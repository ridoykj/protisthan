package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.CurrencyExchangeSettingsDetailsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CurrencyExchangeSettingsDetailsRepository extends JpaRepository<CurrencyExchangeSettingsDetailsDao, String>, JpaSpecificationExecutor<CurrencyExchangeSettingsDetailsDao> {
}
