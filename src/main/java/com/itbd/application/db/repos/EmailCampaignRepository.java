package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.EmailCampaignDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailCampaignRepository extends JpaRepository<EmailCampaignDao, String>, JpaSpecificationExecutor<EmailCampaignDao> {
}
