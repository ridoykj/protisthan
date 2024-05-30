package com.itbd.application.db.repos;


import com.itbd.application.db.dao.support.PauseSlaOnStatusDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PauseSlaOnStatusRepository extends JpaRepository<PauseSlaOnStatusDao, String>, JpaSpecificationExecutor<PauseSlaOnStatusDao> {
}
