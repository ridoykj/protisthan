package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.CampaignItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CampaignItemRepository extends JpaRepository<CampaignItemDao, String>, JpaSpecificationExecutor<CampaignItemDao> {
}
