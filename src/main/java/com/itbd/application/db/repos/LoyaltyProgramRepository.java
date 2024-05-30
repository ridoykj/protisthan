package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.loyalty.LoyaltyProgramDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LoyaltyProgramRepository extends JpaRepository<LoyaltyProgramDao, String>, JpaSpecificationExecutor<LoyaltyProgramDao> {
}
