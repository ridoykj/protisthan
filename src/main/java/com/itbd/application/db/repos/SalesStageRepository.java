package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.SalesStageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesStageRepository extends JpaRepository<SalesStageDao, String>, JpaSpecificationExecutor<SalesStageDao> {
}
