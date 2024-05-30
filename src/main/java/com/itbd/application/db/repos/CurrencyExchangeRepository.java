package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.CurrencyExchangeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeDao, String>, JpaSpecificationExecutor<CurrencyExchangeDao> {
}
