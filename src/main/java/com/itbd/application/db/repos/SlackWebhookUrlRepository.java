package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.SlackWebhookUrlDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SlackWebhookUrlRepository extends JpaRepository<SlackWebhookUrlDao, String>, JpaSpecificationExecutor<SlackWebhookUrlDao> {
}
