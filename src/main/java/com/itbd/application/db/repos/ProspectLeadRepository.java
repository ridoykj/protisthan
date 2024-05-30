package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.ProspectLeadDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProspectLeadRepository extends JpaRepository<ProspectLeadDao, String>, JpaSpecificationExecutor<ProspectLeadDao> {
}
