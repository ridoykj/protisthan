package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.opportunity.OpportunityDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OpportunityRepository extends JpaRepository<OpportunityDao, String>, JpaSpecificationExecutor<OpportunityDao> {
}
