package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PortalUserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PortalUserRepository extends JpaRepository<PortalUserDao, String>, JpaSpecificationExecutor<PortalUserDao> {
}
