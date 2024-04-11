package com.itbd.application.db.repos;


import com.itbd.application.db.dao.opportunity.OpportunityLostReasonDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OpportunityLostReasonRepository extends JpaRepository<OpportunityLostReasonDao, String>, JpaSpecificationExecutor<OpportunityLostReasonDao> {
}
