package com.itbd.application.db.repos;


import com.itbd.application.db.dao.campaign.CampaignDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CampaignRepository extends JpaRepository<CampaignDao, String>, JpaSpecificationExecutor<CampaignDao> {
}
