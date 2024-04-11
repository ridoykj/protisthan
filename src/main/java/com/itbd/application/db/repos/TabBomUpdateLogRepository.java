package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bom.BomUpdateLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBomUpdateLogRepository extends JpaRepository<BomUpdateLogDao, String>, JpaSpecificationExecutor<BomUpdateLogDao> {
}
