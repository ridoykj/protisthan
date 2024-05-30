package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.CustomRoleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomRoleRepository extends JpaRepository<CustomRoleDao, String>, JpaSpecificationExecutor<CustomRoleDao> {
}
