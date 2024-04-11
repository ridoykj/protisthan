package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserRepository extends JpaRepository<UserDao, String>, JpaSpecificationExecutor<UserDao> {
}
