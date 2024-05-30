package com.itbd.application.db.repos;


import com.itbd.application.db.dao.selling.sales.SalesTeamDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesTeamRepository extends JpaRepository<SalesTeamDao, String>, JpaSpecificationExecutor<SalesTeamDao> {
}
