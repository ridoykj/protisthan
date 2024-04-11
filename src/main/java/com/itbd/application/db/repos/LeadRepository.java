package com.itbd.application.db.repos;


import com.itbd.application.db.dao.LeadDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LeadRepository extends JpaRepository<LeadDao, String>, JpaSpecificationExecutor<LeadDao> {
}
