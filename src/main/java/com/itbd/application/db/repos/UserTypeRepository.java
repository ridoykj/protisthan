package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserTypeRepository extends JpaRepository<UserTypeDao, String>, JpaSpecificationExecutor<UserTypeDao> {
}
