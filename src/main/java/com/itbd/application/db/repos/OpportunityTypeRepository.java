package com.itbd.application.db.repos;


import com.itbd.application.db.dao.opportunity.OpportunityTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OpportunityTypeRepository extends JpaRepository<OpportunityTypeDao, String>, JpaSpecificationExecutor<OpportunityTypeDao> {
}
