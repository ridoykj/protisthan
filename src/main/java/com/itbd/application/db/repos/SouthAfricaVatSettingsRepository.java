package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SouthAfricaVatSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SouthAfricaVatSettingsRepository extends JpaRepository<SouthAfricaVatSettingsDao, String>, JpaSpecificationExecutor<SouthAfricaVatSettingsDao> {
}
