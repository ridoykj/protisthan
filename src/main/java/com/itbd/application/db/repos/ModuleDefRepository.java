package com.itbd.application.db.repos;


import com.itbd.application.db.dao.modules.ModuleDefDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ModuleDefRepository extends JpaRepository<ModuleDefDao, String>, JpaSpecificationExecutor<ModuleDefDao> {
}
