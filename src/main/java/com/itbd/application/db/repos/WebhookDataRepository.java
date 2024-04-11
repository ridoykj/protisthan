package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.webhook.WebhookDataDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebhookDataRepository extends JpaRepository<WebhookDataDao, String>, JpaSpecificationExecutor<WebhookDataDao> {
}
