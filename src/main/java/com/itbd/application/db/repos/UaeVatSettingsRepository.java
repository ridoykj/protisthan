package com.itbd.application.db.repos;


import com.itbd.application.db.dao.UaeVatSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UaeVatSettingsRepository extends JpaRepository<UaeVatSettingsDao, String>, JpaSpecificationExecutor<UaeVatSettingsDao> {
}
