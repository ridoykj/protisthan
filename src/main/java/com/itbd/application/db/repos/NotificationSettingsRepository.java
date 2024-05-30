package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.NotificationSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NotificationSettingsRepository extends JpaRepository<NotificationSettingsDao, String>, JpaSpecificationExecutor<NotificationSettingsDao> {
}
