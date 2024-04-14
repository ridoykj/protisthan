package com.itbd.application.db.repos;


import com.itbd.application.db.dao.EnergyPointLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EnergyPointLogRepository extends JpaRepository<EnergyPointLogDao, String>, JpaSpecificationExecutor<EnergyPointLogDao> {
}
