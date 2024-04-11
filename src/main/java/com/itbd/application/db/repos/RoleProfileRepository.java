package com.itbd.application.db.repos;


import com.itbd.application.db.dao.RoleProfileDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RoleProfileRepository extends JpaRepository<RoleProfileDao, String>, JpaSpecificationExecutor<RoleProfileDao> {
}
