package com.itbd.application.db.repos;


import com.itbd.application.db.dao.loyaltys.LoyaltyProgramCollectionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LoyaltyProgramCollectionRepository extends JpaRepository<LoyaltyProgramCollectionDao, String>, JpaSpecificationExecutor<LoyaltyProgramCollectionDao> {
}
