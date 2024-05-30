package com.itbd.application.db.repos;


import com.itbd.application.db.dao.support.SlaFulfilledOnStatusDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SlaFulfilledOnStatusRepository extends JpaRepository<SlaFulfilledOnStatusDao, String>, JpaSpecificationExecutor<SlaFulfilledOnStatusDao> {
}
