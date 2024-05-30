package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.loyalty.LoyaltyPointEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LoyaltyPointEntryRepository extends JpaRepository<LoyaltyPointEntryDao, String>, JpaSpecificationExecutor<LoyaltyPointEntryDao> {
}
