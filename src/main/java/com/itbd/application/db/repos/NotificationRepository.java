package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.NotificationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NotificationRepository extends JpaRepository<NotificationDao, String>, JpaSpecificationExecutor<NotificationDao> {
}
