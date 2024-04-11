package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BlockModuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBlockModuleRepository extends JpaRepository<BlockModuleDao, String>, JpaSpecificationExecutor<BlockModuleDao> {
}
