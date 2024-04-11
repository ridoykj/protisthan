package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.webhook.WebhookRequestLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebhookRequestLogRepository extends JpaRepository<WebhookRequestLogDao, String>, JpaSpecificationExecutor<WebhookRequestLogDao> {
}
