package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.NotificationSubscribedDocumentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NotificationSubscribedDocumentRepository extends JpaRepository<NotificationSubscribedDocumentDao, String>, JpaSpecificationExecutor<NotificationSubscribedDocumentDao> {
}
