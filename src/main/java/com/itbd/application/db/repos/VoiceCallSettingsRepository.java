package com.itbd.application.db.repos;


import com.itbd.application.db.dao.telephony.VoiceCallSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface VoiceCallSettingsRepository extends JpaRepository<VoiceCallSettingsDao, String>, JpaSpecificationExecutor<VoiceCallSettingsDao> {
}
