package com.itbd.application.db.repos;


import com.itbd.application.db.dao.geo.CurrencyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CurrencyRepository extends JpaRepository<CurrencyDao, String>, JpaSpecificationExecutor<CurrencyDao> {
}
