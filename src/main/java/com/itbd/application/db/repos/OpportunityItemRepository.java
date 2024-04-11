package com.itbd.application.db.repos;


import com.itbd.application.db.dao.opportunity.OpportunityItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OpportunityItemRepository extends JpaRepository<OpportunityItemDao, String>, JpaSpecificationExecutor<OpportunityItemDao> {
}
