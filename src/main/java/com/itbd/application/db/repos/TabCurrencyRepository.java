package com.itbd.application.db.repos;


import com.itbd.application.db.dao.currencys.CurrencyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCurrencyRepository extends JpaRepository<CurrencyDao, String>, JpaSpecificationExecutor<CurrencyDao> {
}
