package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ProspectOpportunityDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProspectOpportunityRepository extends JpaRepository<ProspectOpportunityDao, Long>, JpaSpecificationExecutor<ProspectOpportunityDao> {
}
