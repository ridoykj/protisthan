package com.itbd.application.db.repos;


import com.itbd.application.db.dao.HasRoleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface HasRoleRepository extends JpaRepository<HasRoleDao, String>, JpaSpecificationExecutor<HasRoleDao> {
}
