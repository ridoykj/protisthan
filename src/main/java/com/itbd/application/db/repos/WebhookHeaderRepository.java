package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.webhook.WebhookHeaderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebhookHeaderRepository extends JpaRepository<WebhookHeaderDao, String>, JpaSpecificationExecutor<WebhookHeaderDao> {
}
