package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.CompetitorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CompetitorRepository extends JpaRepository<CompetitorDao, String>, JpaSpecificationExecutor<CompetitorDao> {
}
