package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.LeadSourceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LeadSourceRepository extends JpaRepository<LeadSourceDao, String>, JpaSpecificationExecutor<LeadSourceDao> {
}
