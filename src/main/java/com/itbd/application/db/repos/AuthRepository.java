package com.itbd.application.db.repos;

import com.itbd.application.db.dao.system.AuthDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AuthRepository extends JpaRepository<AuthDao, String>, JpaSpecificationExecutor<AuthDao> {
}
