package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserTypeModuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserTypeModuleRepository extends JpaRepository<UserTypeModuleDao, String>, JpaSpecificationExecutor<UserTypeModuleDao> {
}
