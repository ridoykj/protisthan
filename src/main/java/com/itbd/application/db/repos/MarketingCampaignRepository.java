package com.itbd.application.db.repos;


import com.itbd.application.db.dao.MarketingCampaignDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MarketingCampaignRepository extends JpaRepository<MarketingCampaignDao, String>, JpaSpecificationExecutor<MarketingCampaignDao> {
}
