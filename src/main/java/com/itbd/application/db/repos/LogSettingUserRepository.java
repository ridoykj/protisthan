package com.itbd.application.db.repos;


import com.itbd.application.db.dao.LogSettingUserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LogSettingUserRepository extends JpaRepository<LogSettingUserDao, String>, JpaSpecificationExecutor<LogSettingUserDao> {
}
