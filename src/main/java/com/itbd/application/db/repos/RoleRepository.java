package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.RoleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RoleRepository extends JpaRepository<RoleDao, String>, JpaSpecificationExecutor<RoleDao> {
}
