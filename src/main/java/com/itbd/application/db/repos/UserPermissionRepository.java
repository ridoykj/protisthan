package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserPermissionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserPermissionRepository extends JpaRepository<UserPermissionDao, String>, JpaSpecificationExecutor<UserPermissionDao> {
}
