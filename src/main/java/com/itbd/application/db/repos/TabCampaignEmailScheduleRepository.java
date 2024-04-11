package com.itbd.application.db.repos;


import com.itbd.application.db.dao.campaign.CampaignEmailScheduleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCampaignEmailScheduleRepository extends JpaRepository<CampaignEmailScheduleDao, String>, JpaSpecificationExecutor<CampaignEmailScheduleDao> {
}
