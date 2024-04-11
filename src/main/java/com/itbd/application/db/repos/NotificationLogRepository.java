package com.itbd.application.db.repos;


import com.itbd.application.db.dao.notifications.NotificationLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NotificationLogRepository extends JpaRepository<NotificationLogDao, String>, JpaSpecificationExecutor<NotificationLogDao> {
}
