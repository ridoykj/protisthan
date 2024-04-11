package com.itbd.application.db.repos;


import com.itbd.application.db.dao.modules.ModuleProfileDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ModuleProfileRepository extends JpaRepository<ModuleProfileDao, String>, JpaSpecificationExecutor<ModuleProfileDao> {
}
