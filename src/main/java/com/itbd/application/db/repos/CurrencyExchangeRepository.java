package com.itbd.application.db.repos;


import com.itbd.application.db.dao.currencys.CurrencyExchangeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCurrencyExchangeRepository extends JpaRepository<CurrencyExchangeDao, String>, JpaSpecificationExecutor<CurrencyExchangeDao> {
}
