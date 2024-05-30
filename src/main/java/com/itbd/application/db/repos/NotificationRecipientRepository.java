package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.NotificationRecipientDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NotificationRecipientRepository extends JpaRepository<NotificationRecipientDao, String>, JpaSpecificationExecutor<NotificationRecipientDao> {
}
