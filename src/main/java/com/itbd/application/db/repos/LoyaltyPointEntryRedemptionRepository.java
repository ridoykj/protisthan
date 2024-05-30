package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.loyalty.LoyaltyPointEntryRedemptionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LoyaltyPointEntryRedemptionRepository extends JpaRepository<LoyaltyPointEntryRedemptionDao, String>, JpaSpecificationExecutor<LoyaltyPointEntryRedemptionDao> {
}
