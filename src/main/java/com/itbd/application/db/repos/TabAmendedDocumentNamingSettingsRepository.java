package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AmendedDocumentNamingSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAmendedDocumentNamingSettingsRepository extends JpaRepository<AmendedDocumentNamingSettingsDao, String>, JpaSpecificationExecutor<AmendedDocumentNamingSettingsDao> {
}
