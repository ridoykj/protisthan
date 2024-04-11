package com.itbd.application.db.repos;


import com.itbd.application.db.dao.price.PriceListCountryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PriceListCountryRepository extends JpaRepository<PriceListCountryDao, String>, JpaSpecificationExecutor<PriceListCountryDao> {
}
