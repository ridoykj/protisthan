package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.CustomsTariffNumberDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomsTariffNumberRepository extends JpaRepository<CustomsTariffNumberDao, String>, JpaSpecificationExecutor<CustomsTariffNumberDao> {
}
