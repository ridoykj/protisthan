package com.itbd.application.db.repos;


import com.itbd.application.db.dao.printing.NetworkPrinterSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NetworkPrinterSettingsRepository extends JpaRepository<NetworkPrinterSettingsDao, String>, JpaSpecificationExecutor<NetworkPrinterSettingsDao> {
}
