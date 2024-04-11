package com.itbd.application.db.repos;

import com.itbd.application.db.dao.IncomingCallSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IncomingCallSettingsRepository extends JpaRepository<IncomingCallSettingsDao, String>, JpaSpecificationExecutor<IncomingCallSettingsDao> {
}
