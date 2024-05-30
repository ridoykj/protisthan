package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.BlockModuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BlockModuleRepository extends JpaRepository<BlockModuleDao, String>, JpaSpecificationExecutor<BlockModuleDao> {
}
