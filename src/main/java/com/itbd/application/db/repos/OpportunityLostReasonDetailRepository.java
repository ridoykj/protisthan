package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.opportunity.OpportunityLostReasonDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OpportunityLostReasonDetailRepository extends JpaRepository<OpportunityLostReasonDetailDao, String>, JpaSpecificationExecutor<OpportunityLostReasonDetailDao> {
}
