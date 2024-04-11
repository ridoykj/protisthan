package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserGroupRepository extends JpaRepository<UserGroupDao, String>, JpaSpecificationExecutor<UserGroupDao> {
}
