package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.webhook.WebhookDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebhookRepository extends JpaRepository<WebhookDao, String>, JpaSpecificationExecutor<WebhookDao> {
}
