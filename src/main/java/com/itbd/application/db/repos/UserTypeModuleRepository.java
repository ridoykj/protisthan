package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.user.UserTypeModuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserTypeModuleRepository extends JpaRepository<UserTypeModuleDao, String>, JpaSpecificationExecutor<UserTypeModuleDao> {
}
